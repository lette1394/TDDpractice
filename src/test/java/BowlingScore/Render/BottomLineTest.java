package BowlingScore.Render;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BottomLineTest {
    @Test
    void render_bottom_line_with_size3() throws Exception {
        RenderContext.RenderContextMaker maker = RenderContext.getMaker().setBlockWidth(3);

        List<RenderContext> contextList = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .map(maker::make)
                .collect(Collectors.toList());

        String ret = BottomLine.render(contextList);

        String expected =
                "|       |       |       |       |       |       |       |       |       |           |\n" +
                "|   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |    10     |\n" +
                "|_______|_______|_______|_______|_______|_______|_______|_______|_______|___________|";

        assertThat(ret).isEqualTo(expected);
    }
}
