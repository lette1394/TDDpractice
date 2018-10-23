package BowlingScore;

import BowlingScore.Render.Util;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest {

    @Test
    void generate_string_1() throws Exception {
        String expected = "aaa";

        String actual = Util.generateStringXTimes("a", 3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void generate_string_2() throws Exception {
        String expected = "_____";

        String actual = Util.generateStringXTimes("_", 5);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void generate_empty_string() throws Exception {
        String expected = "";

        String actual = Util.generateStringXTimes("abc", 0);

        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void insert_string_to_1() throws Exception {
        String expected = "___a___";

        String actual = Util.insertStringTo("_______", "a");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void insert_string_to_2() throws Exception {
        String expected = "k";

        String actual = Util.insertStringTo("_", "k");

        assertThat(actual).isEqualTo(expected);
    }
}
