package Calculator;

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
    void handles_add_1_2_3() throws Exception {
        // arrange
        String input = "1:2:3";
        String expected = "6";
        simulate(input);

        // act
        Main.main(null);

        // assert
        assertEquals(expected, out.toString());
    }

    @Test
    void handles_add_0_1_2() throws Exception {
        String input = "0:1:2";
        String expected = "3";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    void handles_add_567() throws Exception {
        String input = "5:6:7";
        String expected = "18";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    void handles_add_0_0_0_0() throws Exception {
        String input = "0:0:0:0";
        String expected = "0";
        simulate(input);

        Main.main(null);

        assertEquals(expected, out.toString());
    }
}
