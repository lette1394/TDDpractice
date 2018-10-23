package BowlingScore;

import BowlingScore.Render.Environment;
import BowlingScore.Render.TopLine;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TopLineTest {

    @Test
    void render_1_stages() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(1);
        String ret = TopLine.render(env);

        String expected =
                        " _______ \n" +
                        "|___1___|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_9_stages() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(9);
        String ret = TopLine.render(env);

        String expected =
                        " _______________________________________________________________________ \n" +
                        "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_10_stages() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(10);
        String ret = TopLine.render(env);

        String expected =
                " ___________________________________________________________________________________ \n" +
                        "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|____10_____|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_with_custom_vertical_delimiter() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(5)
                .setBlockWidth(3)
                .setDelimiter(":");

        String ret = TopLine.render(env);
        String expected =
                " _______________________________________ \n" +
                        ":___1___:___2___:___3___:___4___:___5___:";

        assertThat(ret).isEqualTo(expected);
    }

}
