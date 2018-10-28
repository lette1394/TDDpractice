package BowlingScore.Render;

import java.util.List;

public class BottomLine {
    public static String render(List<RenderContext> contextList) {
        return "|       |       |       |       |       |       |       |       |       |           |\n" +
                "|   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |    10     |\n" +
                "|_______|_______|_______|_______|_______|_______|_______|_______|_______|___________|";
    }


}
