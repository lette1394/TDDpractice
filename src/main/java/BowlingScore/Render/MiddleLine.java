package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Collection;

public class MiddleLine {
    public static String render(Collection<StageScore> scoreList) {
        StringBuilder sb = new StringBuilder();

        sb.append("|");
        scoreList.forEach(score -> {
            sb.append(renderCeiling(score));
            sb.append("|");
        });
        sb.append("\n");


        sb.append("|");
        scoreList.forEach(score -> {
            sb.append(renderScore(score));
            sb.append("|");
        });
        sb.append("\n");


        sb.append("|");
        scoreList.forEach(score -> {
            sb.append(renderFloor(score));
            sb.append("|");
        });

        return sb.toString();
    }

    private static String renderCeiling(StageScore score) {
        Integer stage = score.getStage();

        if (stage == 10) {
            return String.format("%s", "   |   |   ");
        }

        return String.format("%s", "   |   ");
    }

    private static String renderScore(StageScore score) {
        Integer stage = score.getStage();

        String first = score.getFirstTryScore();
        String second = score.getSecondTryScore();
        String third = score.getThirdTryScore();

        if (stage == 10) {
            return String.format(" %s %s %s %s %s ", first, "|", second, "|", third);
        }

        return String.format(" %s %s %s ", first, "|", second);
    }

    private static String renderFloor(StageScore score) {
        Integer stage = score.getStage();

        if (stage == 10) {
            return String.format("%s", "___|___|___");
        }

        return String.format("%s", "___|___");
    }
}
