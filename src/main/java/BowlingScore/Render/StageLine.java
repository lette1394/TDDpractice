package BowlingScore.Render;

public class StageLine {
    private Integer stage;

    public static StageLine stageLine(Integer stage) {
        return new StageLine(stage);
    }

    public String render(Integer blockWidth) {
        return String.format("|%s%s%s", this.renderLeft(blockWidth), stage, this.renderRight(blockWidth));
    }

    private StageLine(Integer stage) {
        this.stage = stage;
    }

    private String renderLeft(Integer blockWidth) {
        return getUnderScore(blockWidth);
    }

    private String renderRight(Integer blockWidth) {
        return getUnderScore(blockWidth);
    }

    private String getUnderScore(int times) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < times; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
}
