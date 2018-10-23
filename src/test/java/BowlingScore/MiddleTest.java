package BowlingScore;

import BowlingScore.Render.Middle;
import BowlingScore.Render.RenderContext;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleTest {

    @Test
    void render_ceiling() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "9", "/");

        String ret = Middle.renderCeiling(stageScore);

        String expected = "   |   ";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_ceiling_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "9", "/");
        RenderContext context = RenderContext.context().setBlockWidth(5);

        String ret = Middle.renderCeiling(context, stageScore);

        String expected = "     |     ";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_score() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");

        String ret = Middle.renderScore(stageScore);
        String expected = " X |   ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_score_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");
        RenderContext context = RenderContext.context().setBlockWidth(5);

        String ret = Middle.renderScore(context, stageScore);
        String expected = "  X  |     ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_score_width6() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");
        RenderContext context = RenderContext.context().setBlockWidth(6);

        String ret = Middle.renderScore(context, stageScore);
        String expected = "   X  |      ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_floor() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "6", "3");

        String ret = Middle.renderFloor(stageScore);
        String expected = "___|___";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_floor_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "6", "3");
        RenderContext context = RenderContext.context().setBlockWidth(5);

        String ret = Middle.renderFloor(context, stageScore);
        String expected = "_____|_____";

        assertThat(ret).isEqualTo(expected);
    }
}
