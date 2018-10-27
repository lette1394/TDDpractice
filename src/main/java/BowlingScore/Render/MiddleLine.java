package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiddleLine {
    public static String render(List<RenderContext> contextList, List<StageScore> scoreList) {
        List<Middle> middleList = Stream.iterate(0, i -> i + 1)
                .limit(contextList.size())
                .map(i -> Middle.middle()
                        .setRenderContext(contextList.get(i))
                        .setStageScore(scoreList.get(i)))
                .collect(Collectors.toList());

        List<Function<Middle, String>> mappers = Arrays.asList(
                Middle::renderCeiling,
                Middle::renderContents,
                Middle::renderFloor
        );

        return mappers.stream()
                .map(mapper -> _render(middleList, mapper))
                .collect(Collectors.joining("\n"));
    }

    private static String _render(List<Middle> middleList, Function<Middle, String> mapper) {
        StringBuilder sb = new StringBuilder();

        sb.append("|");
        for (Middle middle : middleList) {
            sb.append(mapper.apply(middle));
            sb.append("|");
        }

        return sb.toString();
    }
}
