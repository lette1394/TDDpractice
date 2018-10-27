package BowlingScore.Render;

import BowlingScore.Render.RenderContext.RenderContextMaker;
import BowlingScore.StageScore;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static BowlingScore.StageScore.stageScore;
import static org.assertj.core.api.Assertions.assertThat;

public class MiddleLineTest {
    @Test
    void render_middle_line() throws Exception {
        String expected =
                        "|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n" +
                        "| 9 | / | X |   | X |   | 9 | 8 | 9 | - | 9 | 8 | 9 | 8 | 9 | 8 | 9 | 8 | a | b | c |\n" +
                        "|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|";
        List<StageScore> scoreList = Arrays.asList(
                stageScore(1, "9", "/"),
                stageScore(2, "X", " "),
                stageScore(3, "X", " "),
                stageScore(4, "9", "8"),
                stageScore(5, "9", "-"),
                stageScore(6, "9", "8"),
                stageScore(7, "9", "8"),
                stageScore(8, "9", "8"),
                stageScore(9, "9", "8"),
                stageScore(10, "a", "b", "c")
        );
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);
        List<RenderContext> contextList = Stream.iterate(1, i -> i+1)
                .limit(10)
                .map(maker::make)
                .collect(Collectors.toList());

        String ret = MiddleLine.render(contextList, scoreList);

        assertThat(ret).isEqualTo(expected);
    }


    @Test
    void render_middle_line_in_1() throws Exception {
        String expected =
                "|   |   |\n" +
                        "| 9 | / |\n" +
                        "|___|___|";

        List<StageScore> scoreList = Arrays.asList(stageScore(1, "9", "/"));
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);
        List<RenderContext> contextList = Stream.iterate(0, i -> i+1)
                .limit(scoreList.size())
                .map(maker::make)
                .collect(Collectors.toList());

        String ret = MiddleLine.render(contextList, scoreList);

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_middle_line_in_3() throws Exception {
        String expected =
                        "|   |   |   |   |   |   |\n" +
                        "| 5 | 6 | X |   | 1 | / |\n" +
                        "|___|___|___|___|___|___|";

        List<StageScore> scoreList = Arrays.asList(
                stageScore(1, "5", "6"),
                stageScore(1, "X", " "),
                stageScore(1, "1", "/")
        );
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);
        List<RenderContext> contextList = Stream.iterate(0, i -> i+1)
                .limit(scoreList.size())
                .map(maker::make)
                .collect(Collectors.toList());


        String ret = MiddleLine.render(contextList, scoreList);

        assertThat(ret).isEqualTo(expected);
    }
}
