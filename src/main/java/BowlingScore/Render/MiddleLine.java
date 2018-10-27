package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiddleLine {
    public static String render(List<RenderContext> contextList, List<StageScore> scoreList) {
        List<Middle> middleList = Stream.iterate(0, i->i+1)
                .limit(contextList.size())
                .map(i -> Middle.middle()
                        .setRenderContext(contextList.get(i))
                        .setStageScore(scoreList.get(i)))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        sb.append("|");
        for (Middle middle : middleList) {
            sb.append(middle.renderCeiling());
            sb.append("|");
        }

        sb.append("\n");

        sb.append("|");
        for (Middle middle : middleList) {
            sb.append(middle.renderContents());
            sb.append("|");
        }

        sb.append("\n");

        sb.append("|");
        for (Middle middle : middleList) {
            sb.append(middle.renderFloor());
            sb.append("|");
        }

        return sb.toString();
    }
}
