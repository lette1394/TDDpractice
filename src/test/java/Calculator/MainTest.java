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
    void test1() throws Exception {
        // arrange
        String input = "1:2:3";
        simulate(input);

        // act
        Main.main(null);

        // assert
        assertEquals("6", out.toString());
    }
}
