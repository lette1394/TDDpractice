package BowlingScore;

import BowlingScore.Render.Middle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleTest {

    @Test
    void render_stage_1() throws Exception {
        Middle middle = Middle.middle()
                .setStage(2)
                .setFirstTryScore("9")
                .setSecondTryScore("/");

        String ret = middle.render(3);
        String expected =
                        "   |   \n" +
                        " 9 | / \n" +
                        "___|___";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_stage_2() throws Exception {
        Middle middle = Middle.middle()
                .setStage(2)
                .setFirstTryScore("X")
                .setSecondTryScore(" ");

        String ret = middle.render(3);
        String expected =
                        "   |   \n" +
                        " X |   \n" +
                        "___|___";

        assertThat(ret).isEqualTo(expected);
    }
}
