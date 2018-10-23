package BowlingScore.Render;

import java.util.stream.Stream;

public class TopLine {
    private static Integer startNumber = 1;

    private static String renderContents(Environment env) {
        final Integer totalStage = env.getTotalStage();
        final Integer blockWidth = env.getBlockWidth();
        final String delimiter = env.getDelimiter();

        return Stream.iterate(startNumber, i -> i + 1)
                .limit(totalStage)
                .map(Top::stage)
                .map(top -> top.renderContents(blockWidth))
                .reduce((a, b) -> a + delimiter + b)
                .map(last -> delimiter + last + delimiter)
                .orElse("");
    }

    private static String renderTop(Environment env) {
        final Integer totalStage = env.getTotalStage();
        final Integer blockWidth = env.getBlockWidth();
        final String delimiter = "_";
        final String padding = " ";

        return Stream.iterate(startNumber, i -> i + 1)
                .limit(totalStage)
                .map(Top::stage)
                .map(top -> top.renderTop(blockWidth))
                .reduce((a, b) -> a + delimiter + b)
                .map(last -> padding + last + padding)
                .orElse("");
    }

    public static String render(Environment env) {
        return renderTop(env) + "\n" + renderContents(env);
    }

}
