package BowlingScore;

import BowlingScore.Render.Middle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleTest {

    @Test
    void render_stage_1() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "9", "/");

        String ret = Middle.render(3, stageScore);

        String expected =
                        "   |   \n" +
                        " 9 | / \n" +
                        "___|___";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_stage_2() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");

        String ret = Middle.render(3, stageScore);
        String expected =
                        "   |   \n" +
                        " X |   \n" +
                        "___|___";

        assertThat(ret).isEqualTo(expected);
    }
}
