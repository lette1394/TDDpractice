package BowlingScore;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainMethod {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }


    @Test
    void show_whole_score() throws Exception {
        String input = "";
        String expected = "";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }
}
