package BowlingScore.Render;

import java.util.stream.Stream;

public class StageLine {
    private static Integer startNumber = 1;

    public static String renderContents(Integer limit, Integer blockWidth, String delimiter) {
        return Stream.iterate(startNumber, i -> i + 1)
                .limit(limit)
                .map(Stage::stage)
                .map(stage -> delimiter + stage.render(blockWidth))
                .reduce((a, b) -> a + b)
                .map(last -> last + delimiter)
                .orElse("");
    }

    public static String renderContents(Environment env) {
        final Integer totalStage = env.getTotalStage();
        final Integer blockWidth = env.getBlockWidth();
        final String delimiter = env.getDelimiter();

        return renderContents(totalStage, blockWidth, delimiter);
    }

    public static String renderTop() {
        return " ___________________________________________________________________________________";
    }

    public static String render(Environment env) {
        return renderTop() + "\n" + renderContents(env);
    }

}
