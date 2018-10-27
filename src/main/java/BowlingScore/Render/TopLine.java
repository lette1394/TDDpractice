package BowlingScore.Render;

import BowlingScore.Render.RenderContext.RenderContextMaker;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TopLine {
    private static String verticalDelimiter;
    private static String horizontalDelimiter;
    private static String padding;

    private static Supplier<Stream<Top>> topStream;

    public static String render(RenderContext context) {
        initialize(context);

        return renderCeiling() + renderLineBreak() + renderContents();
    }

    private static String renderCeiling() {
        return _render(Top::renderCeiling, horizontalDelimiter, padding);
    }

    private static String renderContents() {
        return _render(Top::renderContents, verticalDelimiter, verticalDelimiter);
    }

    private static String renderLineBreak() {
        return "\n";
    }

    private static String _render(Function<Top, String> renderFunction, String delimiter, String padding) {
        return topStream.get()
                .map(renderFunction)
                .reduce((a, b) -> a + delimiter + b)
                .map(last -> padding + last + padding)
                .orElse("");
    }

    private static void initialize(RenderContext context) {
        initializeMember(context);
        allocate(context);
    }

    private static void initializeMember(RenderContext context) {
        horizontalDelimiter = context.getHorizontalDelimiter();
        verticalDelimiter = context.getVerticalDelimiter();
        padding = context.getPadding();
    }

    private static void allocate(RenderContext context) {
        Integer startNumber = context.getStartNumber();
        Integer totalStage = context.getStage();
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);

        topStream = () -> Stream.iterate(startNumber, i -> i + 1)
                .limit(totalStage)
                .map(maker::make)
                .map(Top::top);
    }
}
