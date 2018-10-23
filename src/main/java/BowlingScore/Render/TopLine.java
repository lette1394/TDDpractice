package BowlingScore.Render;

import java.util.stream.Stream;

public class TopLine {
    private static Integer startNumber = 1;

    private static String renderContents(Environment env) {
        final Integer totalStage = env.getTotalStage();
        final Integer blockWidth = env.getBlockWidth();
        final String delimiter = env.getDelimiter();

        return renderContents(totalStage, blockWidth, delimiter);
    }

    private static String renderContents(Integer limit, Integer blockWidth, String delimiter) {
        return Stream.iterate(startNumber, i -> i + 1)
                .limit(limit)
                .map(Top::stage)
                .map(top -> top.renderContents(blockWidth))
                .reduce((a, b) -> a + delimiter + b)
                .map(last -> delimiter + last + delimiter)
                .orElse("");
    }

    private static String renderTop(Environment env) {

        return Stream.iterate(1, i -> i + 1)
                .limit(env.getTotalStage())
                .map(Top::stage)
                .map(top -> top.renderTop(env.getBlockWidth()))
                .reduce((a, b) -> a + "_" + b)
                .map(last -> " " + last)
                .orElse("");
    }

    public static String render(Environment env) {
        return renderTop(env) + "\n" + renderContents(env);
    }

}
