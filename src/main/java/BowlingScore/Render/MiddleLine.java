package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Collection;
import java.util.function.Function;

public class MiddleLine {
    public static String render(Collection<StageScore> scoreList) {

        return String.join("\n",
                _render(Middle::renderCeiling, scoreList),
                _render(Middle::renderScore, scoreList),
                _render(Middle::renderFloor, scoreList));
    }

    private static String _render(Function<StageScore, String> mapper, Collection<StageScore> scoreList) {
        return scoreList.stream()
                .map(mapper)
                .reduce((a, b) -> a + "|" + b)
                .map(last -> "|" + last + "|")
                .orElse("");
    }
}
