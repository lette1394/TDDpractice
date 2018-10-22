package BowlingScore;

import BowlingScore.Render.StageLine;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StageLineTest {

    @Test
    void create_stage() throws Exception {
        StageLine stageLine = StageLine.stageLine(7);
        Integer blockWidth = 3;
        String expected = "___7___";

        String ret = stageLine.render(blockWidth);

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void creates_multiple_stages() throws Exception {
        Integer blockWidth = 3;
        String ret = Stream.of(1, 2, 6, 7)
                .map(StageLine::stageLine)
                .map(stageLine -> stageLine.render(blockWidth))
                .reduce((a, b) -> a + b)
                .orElse("");
        String expected = "___1______2______6______7___";

        assertThat(ret).isEqualTo(expected);
    }

    @Test
    void create_at_10_must_be_longer() throws Exception {
        StageLine stageLine = StageLine.stageLine(10);
        Integer blockWidth = 3;
        String expected = "____10_____";

        String ret = stageLine.render(blockWidth);

        assertThat(ret).isEqualTo(expected);
    }
}
