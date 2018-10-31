package BowlingScore.Render;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BottomLine {
    public static String render(List<RenderContext> contextList) {
        String top = contextList.stream()
                .map(RenderContext::renderBottomCeiling)
                .collect(Collectors.joining("|", "|", "|"));

        String mid = contextList.stream()
                .map(RenderContext::renderBottomContents)
                .collect(Collectors.joining("|", "|", "|"));

        String bot = contextList.stream()
                .map(RenderContext::renderBottomFloor)
                .collect(Collectors.joining("|", "|", "|"));


        return String.join("\n", top, mid, bot);
    }

    private static String _render(List<RenderContext> contextList, Function<RenderContext, String> mapper) {
        return contextList.stream()
                .map(mapper)
                .collect(Collectors.joining("|", "|", "|"));
    }
}
