package BowlingScore;

import BowlingScore.Render.Middle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleTest {

    @Test
    void render_stage_1() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "9", "/");

        String ret = Middle.renderCeiling(stageScore);

        String expected = "   |   ";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_stage_2() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");

        String ret = Middle.renderScore(stageScore);
        String expected = " X |   ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_stage_3() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "6", "3");

        String ret = Middle.renderFloor(stageScore);
        String expected = "___|___";

        assertThat(ret).isEqualTo(expected);
    }
}
