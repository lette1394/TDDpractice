package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Collection;
import java.util.function.Function;

public class MiddleLine {
    public static String render(Collection<StageScore> scoreList) {

        return String.join("\n",
                renderLine(Middle::renderCeiling, scoreList),
                renderLine(Middle::renderScore, scoreList),
                renderLine(Middle::renderFloor, scoreList));
    }

    private static String renderLine(Function<StageScore, String> mapper, Collection<StageScore> scoreList) {
        StringBuilder sb = new StringBuilder();

        sb.append("|");
        scoreList.forEach(score -> {
            sb.append(mapper.apply(score));
            sb.append("|");
        });

        return sb.toString();
    }
}
