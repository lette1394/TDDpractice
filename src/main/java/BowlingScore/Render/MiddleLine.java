package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Collection;

import static BowlingScore.Render.Middle.*;

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
}
