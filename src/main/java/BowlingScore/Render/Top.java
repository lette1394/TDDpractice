package BowlingScore.Render;

public class Top {
    private Integer stage;

    private Top(Integer stage) {
        this.stage = stage;
    }

    public static Top top(Integer num) {
        return new Top(num);
    }

    public String renderCeiling(Integer blockWidth) {
        if (stage < 10) {
            return String.format("%s", "_______");

        }
        return String.format("%s", "___________");
    }

    public String renderContents(Integer blockWidth) {
        if (stage < 10) {
            return String.format("%s%s%s", "___", stage, "___");
        }

        return String.format("%s%s%s", "____", stage, "_____");
    }


}
