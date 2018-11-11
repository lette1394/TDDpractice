package Calculator;

// 1:2:3 => 6
// 5:1:2 => 8

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    void addOne() {
        // arrange
        String input = "1";
        String expected = "1";
        simulate(input);

        // run
        Main.main(null);

        // assertion
        assertEquals(expected, out.toString());
    }

    @Test
    void addTwo() {
        String input = "1+2";
        String expected = "3";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    void addThree() {
        String input = "1+2+3";
        String expected = "6";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    void addFour() {
        String input = "1+2+3+4";
        String expected = "10";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    void addFour2() {
        String input = "2+7+10+555";
        String expected = "574";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    void handle_blank_between_numbers() {
        String input = "2 + 7 +10+ 555";
        String expected = "574";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }


}
