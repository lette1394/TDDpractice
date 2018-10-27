package BowlingScore.Render;

public class Bottom {
    public static String renderCeiling(RenderContext context) {
        return "       ";
    }

    public static String renderBottom(RenderContext context) {
        return String.format("%3s%s%3s", "", "1", "");
    }
}
