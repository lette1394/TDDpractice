package BowlingScore;

import BowlingScore.Render.StageLine;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StageLineTest {

    @Test
    void createStages() throws Exception {
        StageLine stageLine = StageLine.stageLine(1);
        Integer blockWidth = 3;
        String expected = "|___1___";

        String line = stageLine.render(blockWidth);

        assertThat(line).isEqualTo(expected);
    }
}
