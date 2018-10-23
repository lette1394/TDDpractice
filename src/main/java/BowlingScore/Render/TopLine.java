package BowlingScore.Render;

import java.util.function.Function;
import java.util.stream.Stream;

public class TopLine {
    private static Integer startNumber;
    private static Integer totalStage;
    private static Integer blockWidth;
    private static String verticalDelimiter;
    private static String horizontalDelimiter;
    private static String padding;

    private static String renderContents() {
        return render(top -> top.renderContents(blockWidth), verticalDelimiter, verticalDelimiter);
    }

    private static String renderTop() {
        return render(top -> top.renderTop(blockWidth), horizontalDelimiter, padding);
    }

    private static String render(Function<Top, String> mapper, String delimiter, String padding) {
        return Stream.iterate(startNumber, i -> i + 1)
                .limit(totalStage)
                .map(Top::stage)
                .map(mapper)
                .reduce((a, b) -> a + delimiter + b)
                .map(last -> padding + last + padding)
                .orElse("");
    }

    public static String render(RenderContext env) {
        startNumber = env.getStartNumber();
        totalStage = env.getTotalStage();
        blockWidth = env.getBlockWidth();
        horizontalDelimiter = env.getHorizontalDelimiter();
        verticalDelimiter = env.getVerticalDelimiter();
        padding = env.getPadding();

        return renderTop() + "\n" + renderContents();
    }

}
