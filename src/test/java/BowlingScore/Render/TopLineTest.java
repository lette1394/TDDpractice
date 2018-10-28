package BowlingScore.Render;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TopLineTest {
    @Test
    void render_1_stages() throws Exception {
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(3)
                .make(1);

        String ret = TopLine.render(context);

        String expected =
                        " _______ \n" +
                        "|___1___|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_9_stages() throws Exception {
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(5)
                .make(9);

        String ret = TopLine.render(context);

        String expected =
                        " _______________________________________________________________________ \n" +
                        "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_10_stages() throws Exception {
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(5)
                .make(10);

        String ret = TopLine.render(context);

        String expected =
                        " ___________________________________________________________________________________ \n" +
                        "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|____10_____|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_with_custom_vertical_delimiter() throws Exception {
        RenderContext context = RenderContext
                .getMaker()
                .setBlockWidth(3)
                .setVerticalDelimiter(":")
                .make(5);

        String ret = TopLine.render(context);
        String expected =
                " _______________________________________ \n" +
                        ":___1___:___2___:___3___:___4___:___5___:";

        assertThat(ret).isEqualTo(expected);
    }

}
