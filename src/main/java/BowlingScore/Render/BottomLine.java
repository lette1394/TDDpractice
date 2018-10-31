package BowlingScore.Render;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BottomLine {
    public static String render(List<RenderContext> contextList) {
//        List<Bottom> bottomList = Stream.iterate(0, i -> i + 1)
//                .limit(contextList.size())
//                .map(i -> Bottom.bottom()
//                        .setRenderContext(contextList.get(i)))
//                .collect(Collectors.toList());
//
//        List<Function<Bottom, String>> mappers = Arrays.asList(
//                Bottom::renderCeiling,
//                Bottom::renderContents,
//                Bottom::renderFloor
//        );

        return contextList.stream()
                .map(RenderContext::renderBottom)
                .collect(Collectors.joining("\n"));
    }

    private static String _render(List<Bottom> bottomList, Function<Bottom, String> mapper) {
        StringBuilder sb = new StringBuilder();

        sb.append("|");
        for (Bottom bottom : bottomList) {
            sb.append(mapper.apply(bottom));
            sb.append("|");
        }

        return sb.toString();
    }
}
