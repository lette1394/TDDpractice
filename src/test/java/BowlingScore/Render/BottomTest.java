package BowlingScore.Render;

import BowlingScore.Render.RenderContext.RenderContextMaker;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BottomTest {
    @Test
    void render_ceiling() throws Exception {
        String expected = "       ";
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);
        RenderContext context = maker.make(3);

        String ret = Bottom.bottom(context).renderCeiling();

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_middle() throws Exception {
        String expected = "   1   ";
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);
        RenderContext context = maker.make(3);

        String ret = Bottom.bottom(context).renderContents();

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_bottom() throws Exception {
        String expected = "       ";
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);
        RenderContext context = maker.make(3);

        String ret = Bottom.bottom(context).renderFloor();

        assertThat(ret).isEqualTo(expected);
    }
}
