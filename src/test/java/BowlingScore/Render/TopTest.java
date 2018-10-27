package BowlingScore.Render;

import BowlingScore.Render.RenderContext.RenderContextMaker;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TopTest {

    @Test
    void create_stage() throws Exception {
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(3)
                .make(7);

        Top topLine = Top.top(context);
        String expected = "___7___";

        String ret = topLine.renderContents();

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void creates_multiple_stages() throws Exception {
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);

        String ret = Stream.of(1, 2, 6, 7)
                .map(maker::make)
                .map(Top::top)
                .map(Top::renderContents)
                .reduce((a, b) -> a + b)
                .orElse("");
        String expected = "___1______2______6______7___";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void create_at_10_must_be_longer() throws Exception {
        RenderContextMaker maker = RenderContext.getMaker();
        maker.setBlockWidth(3);
        RenderContext context = maker.make(10);

        Top top = Top.top(context);
        String expected = "____10_____";

        String ret = top.renderContents();

        assertThat(ret).isEqualTo(expected);
    }
}
