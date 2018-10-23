package BowlingScore.Render;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TopLine {
    private static Integer blockWidth;
    private static String verticalDelimiter;
    private static String horizontalDelimiter;
    private static String padding;

    private static Supplier<Stream<Top>> topStream;

    public static String render(RenderContext env) {
        initialize(env);

        return renderTop() + renderLineBreak() + renderContents();
    }

    private static String renderTop() {
        return _render(top -> top.renderCeiling(blockWidth), horizontalDelimiter, padding);
    }

    private static String renderContents() {
        return _render(top -> top.renderContents(blockWidth), verticalDelimiter, verticalDelimiter);
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
        blockWidth = context.getBlockWidth();
        horizontalDelimiter = context.getHorizontalDelimiter();
        verticalDelimiter = context.getVerticalDelimiter();
        padding = context.getPadding();
    }

    private static void allocate(RenderContext context) {
        Integer startNumber = context.getStartNumber();
        Integer totalStage = context.getTotalStage();

        topStream = () -> Stream.iterate(startNumber, i -> i + 1)
                .limit(totalStage)
                .map(Top::top);
    }
}
