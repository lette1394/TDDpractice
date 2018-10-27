package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Collection;
import java.util.function.Function;

public class MiddleLine {
    public static String render(RenderContext context, Collection<StageScore> scoreList) {
        Middle middle = Middle.middle(context);

        return String.join("\n",
                _render(middle::renderCeiling, scoreList),
                _render(middle::renderScore, scoreList),
                _render(middle::renderFloor, scoreList));
    }

    private static String _render(Function<StageScore, String> mapper, Collection<StageScore> scoreList) {
        return scoreList.stream()
                .map(mapper)
                .reduce((a, b) -> a + "|" + b)
                .map(last -> "|" + last + "|")
                .orElse("");
    }
}
