package BowlingScore.Render;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BottomLine {
    public static String render(List<RenderContext> contextList) {
        List<Function<RenderContext, String>> mapperList = Arrays.asList(
                RenderContext::renderBottomCeiling,
                RenderContext::renderBottomContents,
                RenderContext::renderBottomFloor);

        return mapperList.stream()
                .map(mapper -> renderOneLine(contextList, mapper))
                .collect(Collectors.joining("\n"));
    }

    private static String renderOneLine(List<RenderContext> contextList, Function<RenderContext, String> mapper) {
        return contextList.stream()
                .map(mapper)
                .collect(Collectors.joining("|", "|", "|"));
    }
}
