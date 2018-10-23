package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Collection;
import java.util.function.Function;

import static BowlingScore.Render.Middle.*;

public class MiddleLine {
    public static String render(RenderContext context, Collection<StageScore> scoreList) {
        return String.join("\n",
                _render(score -> renderCeiling(context, score), scoreList),
                _render(score -> renderScore(context, score), scoreList),
                _render(score -> renderFloor(context, score), scoreList));
    }

    private static String _render(Function<StageScore, String> mapper, Collection<StageScore> scoreList) {
        return scoreList.stream()
                .map(mapper)
                .reduce((a, b) -> a + "|" + b)
                .map(last -> "|" + last + "|")
                .orElse("");
    }
}
