package BowlingScore.Render;

import java.util.stream.Stream;

public class StageLine {
    private static Integer startNumber = 1;

    public static String render(Integer limit, Integer blockWidth, String delimiter) {
        return Stream.iterate(startNumber, i -> i + 1)
                .limit(limit)
                .map(Stage::stage)
                .map(stage -> delimiter + stage.render(blockWidth))
                .reduce((a, b) -> a + b)
                .map(last -> last + delimiter)
                .orElse("");
    }
}
