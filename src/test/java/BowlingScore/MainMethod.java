package BowlingScore;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MainMethod {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }


    @Test
    void show_whole_score() throws Exception {
        String input = "";
        String expected =
                " ___________________________________________________________________________________\n" +
                        "|___1___|___2___|___3___|___4___|___5___|___6___|___7___|___8___|___9___|____10_____|\n" +
                        "|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n" +
                        "| 9 | / | X |   | X |   | 9 | 8 | 9 | - | 9 | 8 | 9 | 8 | 9 | 8 | 9 | 8 | a | b | c |\n" +
                        "|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\n" +
                        "|       |       |       |       |       |       |       |       |       |           |\n" +
                        "|   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |    10     |\n" +
                        "|_______|_______|_______|_______|_______|_______|_______|_______|_______|___________|\n";

        simulate(input);

        Main.main(null);

        assertThat(out.toString()).isEqualTo(expected);
    }
}
