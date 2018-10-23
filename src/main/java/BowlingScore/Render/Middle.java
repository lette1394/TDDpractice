package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.stream.Stream;

public class Middle {
    private Middle() {
    }

    private static String getStringXTimes(String str, Integer times) {
        return Stream.iterate(0, i -> i + 1)
                .limit(times)
                .map(i -> str)
                .reduce((a, b) -> a + b)
                .orElse("");
    }

    public static String renderCeiling(RenderContext context, StageScore score) {
        Integer stage = score.getStage();
        Integer blockWidth = context.getBlockWidth();

        if (stage == 10) {
            return String.join("|",
                    getStringXTimes(" ", blockWidth),
                    getStringXTimes(" ", blockWidth),
                    getStringXTimes(" ", blockWidth));
        }

        return String.join("|",
                getStringXTimes(" ", blockWidth),
                getStringXTimes(" ", blockWidth));
    }

    public static String renderScore(RenderContext context, StageScore score) {
        Integer stage = score.getStage();
        Integer blockWidth = context.getBlockWidth();

        String first = score.getFirstTryScore();
        String second = score.getSecondTryScore();
        String third = score.getThirdTryScore();

        String basis = getStringXTimes(" ", blockWidth);

        if (stage == 10) {
            return String.join("|",
                    insertScoreTo(basis, first),
                    insertScoreTo(basis, second),
                    insertScoreTo(basis, third));
        }

        return String.join("|",
                insertScoreTo(basis, first),
                insertScoreTo(basis, second));
    }

    private static String insertScoreTo(String line, String score) {
        int mid = line.length() / 2;
        return line.substring(0, mid) + score + line.substring(mid + 1);
    }

    public static String renderFloor(RenderContext context, StageScore score) {
        Integer stage = score.getStage();
        Integer blockWidth = context.getBlockWidth();

        if (stage == 10) {
            return String.join("|",
                    getStringXTimes("_", blockWidth),
                    getStringXTimes("_", blockWidth),
                    getStringXTimes("_", blockWidth));
        }

        return String.join("|",
                getStringXTimes("_", blockWidth),
                getStringXTimes("_", blockWidth));
    }
}
