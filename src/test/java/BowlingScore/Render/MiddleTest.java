package BowlingScore.Render;

import BowlingScore.StageScore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleTest {

    @Test
    void render_ceiling_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "9", "/");
        RenderContext context = RenderContext.context().setBlockWidth(5);
        Middle middle = Middle.middle(context);

        String ret = middle.renderCeiling(stageScore);

        String expected = "     |     ";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_score_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");
        RenderContext context = RenderContext.context().setBlockWidth(5);
        Middle middle = Middle.middle(context);

        String ret = middle.renderScore(stageScore);
        String expected = "  X  |     ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_score_width6() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");
        RenderContext context = RenderContext.context().setBlockWidth(6);
        Middle middle = Middle.middle(context);

        String ret = middle.renderScore(stageScore);
        String expected = "   X  |      ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_floor_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "6", "3");
        RenderContext context = RenderContext.context().setBlockWidth(5);
        Middle middle = Middle.middle(context);

        String ret = middle.renderFloor(stageScore);
        String expected = "_____|_____";

        assertThat(ret).isEqualTo(expected);
    }
}
