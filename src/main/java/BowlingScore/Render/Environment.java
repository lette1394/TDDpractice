package BowlingScore.Render;

public class Environment {
    private static Integer blockWidth;

    private Environment() {
    }

    public static void setBlockWidth(Integer width) {
        blockWidth = width;
    }

    public static Integer getBlockWidth() {
        return blockWidth;
    }
}
