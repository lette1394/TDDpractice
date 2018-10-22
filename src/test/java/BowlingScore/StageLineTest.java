package BowlingScore;

import BowlingScore.Render.Environment;
import BowlingScore.Render.StageLine;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StageLineTest {

    @Test
    void render_9_stages() throws Exception {
        Integer blockWidth = 3;
        Integer limit = 9;
        String ret = StageLine.render(limit, blockWidth, "|");
        String expected = "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_10_stages() throws Exception {
        Integer blockWidth = 3;
        Integer limit = 10;
        String ret = StageLine.render(limit, blockWidth, "|");
        String expected = "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|____10_____|";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_more_than_10_stages() throws Exception {
        Integer blockWidth = 3;
        Integer limit = 20;
        String ret = StageLine.render(limit, blockWidth, "|");
        String expected = "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|____10_____|____11_____|____12_____|____13_____|____14_____|____15_____|____16_____|____17_____|____18_____|____19_____|____20_____|";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_with_custom_vertical_delimiter() throws Exception {
        Integer blockWidth = 3;
        Integer limit = 5;
        String customDelimiter = ":";
        String ret = StageLine.render(limit, blockWidth, customDelimiter);
        String expected = ":___1___:___2___:___3___:___4___:___5___:";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_9_stages_ENV() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(9);
        String ret = StageLine.render(env);

        String expected = "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_10_stages_ENV() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(10);
        String ret = StageLine.render(env);

        String expected = "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|____10_____|";
        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_more_than_10_stages_ENV() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(20)
                .setBlockWidth(3)
                .setDelimiter("|");

        String ret = StageLine.render(env);
        String expected = "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|____10_____|____11_____|____12_____|____13_____|____14_____|____15_____|____16_____|____17_____|____18_____|____19_____|____20_____|";

        assertThat(ret).isEqualTo(expected);
    }


    @Test
    void render_with_custom_vertical_delimiter_ENV() throws Exception {
        Environment env = Environment.env()
                .setTotalStage(5)
                .setBlockWidth(3)
                .setDelimiter(":");

        String ret = StageLine.render(env);
        String expected = ":___1___:___2___:___3___:___4___:___5___:";

        assertThat(ret).isEqualTo(expected);
    }
}
