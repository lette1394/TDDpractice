package BowlingScore.Render;

import BowlingScore.Render.*;
import BowlingScore.Render.RenderContext;
import org.junit.jupiter.api.Test;

import static BowlingScore.Render.RenderContext.context;
import static org.assertj.core.api.Assertions.assertThat;

public class BottomTest {
    @Test
    void render_ceiling() throws Exception {
        String expected = "       ";
        RenderContext context = context().setBlockWidth(3);

        String ret = Bottom.create().renderCeiling(context);

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_middle() throws Exception {
        String expected = "   1   ";
        RenderContext context = context().setBlockWidth(3);

        String ret = Bottom.create().renderContents(context);

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_bottom() throws Exception {
        String expected = "       ";
        RenderContext context = context().setBlockWidth(3);

        String ret = Bottom.create().renderFloor(context);

        assertThat(ret).isEqualTo(expected);
    }
}
