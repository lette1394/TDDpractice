package BowlingScore.Render;

import BowlingScore.Render.RenderContext.RenderContextMaker;
import BowlingScore.StageScore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleTest {

    @Test
    void render_ceiling_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "9", "/");
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(5);
        RenderContext context = maker.make(3);

        Middle middle = Middle.middle()
                .setRenderContext(context)
                .setStageScore(stageScore);

        String ret = middle.renderCeiling();

        String expected = "     |     ";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_score_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(5)
                .make(3);

        Middle middle = Middle.middle()
                .setRenderContext(context)
                .setStageScore(stageScore);

        String ret = middle.renderContents();
        String expected = "  X  |     ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_score_width6() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "X", " ");
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(6)
                .make(3);
        Middle middle = Middle.middle()
                .setRenderContext(context)
                .setStageScore(stageScore);

        String ret = middle.renderContents();
        String expected = "   X  |      ";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_floor_width5() throws Exception {
        StageScore stageScore = StageScore.stageScore(1, "6", "3");
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(5)
                .make(3);
        Middle middle = Middle.middle()
                .setRenderContext(context)
                .setStageScore(stageScore);

        String ret = middle.renderFloor();
        String expected = "_____|_____";

        assertThat(ret).isEqualTo(expected);
    }
}
