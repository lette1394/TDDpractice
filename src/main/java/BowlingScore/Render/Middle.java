package BowlingScore.Render;

import BowlingScore.StageScore;

public class Middle {
    private Middle() {
    }

    public static String renderCeiling(StageScore score) {
        Integer stage = score.getStage();

        if (stage == 10) {
            return String.format("%s", "   |   |   ");
        }

        return String.format("%s", "   |   ");
    }

    public static String renderScore(StageScore score) {
        Integer stage = score.getStage();

        String first = score.getFirstTryScore();
        String second = score.getSecondTryScore();
        String third = score.getThirdTryScore();

        if (stage == 10) {
            return String.format(" %s %s %s %s %s ", first, "|", second, "|", third);
        }

        return String.format(" %s %s %s ", first, "|", second);
    }

    public static String renderFloor(StageScore score) {
        Integer stage = score.getStage();

        if (stage == 10) {
            return String.format("%s", "___|___|___");
        }

        return String.format("%s", "___|___");
    }
}
