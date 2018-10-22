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
                        "|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\n";

        String ret = MiddleLine.render();

        assertThat(ret).isEqualTo(expected);
    }
}
