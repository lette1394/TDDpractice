package BowlingScore;

import BowlingScore.Render.MiddleLine;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleLineTest {
    @Test
    void render_middle_line() throws Exception {
        String expected =
                "|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n" +
                        "| 9 | / | X |   | X |   | 9 | 8 | 9 | - | 9 | 8 | 9 | 8 | 9 | 8 | 9 | 8 | a | b | c |\n" +
                        "|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|";

        String ret = MiddleLine.render(10);

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void render_middle_line_in_5() throws Exception {
        String expected =
                "|   |   |   |   |   |   |   |   |   |   |   |\n" +
                        "| 9 | / | X |   | X |   | 9 | 8 | a | b | c |\n" +
                        "|___|___|___|___|___|___|___|___|___|___|___|";

        String ret = MiddleLine.render(5);

        assertThat(ret).isEqualTo(expected);
    }
}
