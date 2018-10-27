package BowlingScore.Render;

class Top {
    private RenderContext context;

    private Top(RenderContext context) {
        this.context = context;
    }

    static Top top(RenderContext context) {
        return new Top(context);
    }

    String renderCeiling() {
        if (context.getStage() < 10) {
            return String.format("%s", "_______");

        }
        return String.format("%s", "___________");
    }

    String renderContents() {
        if (context.getStage() < 10) {
            return String.format("%s%s%s", "___", context.getStage(), "___");
        }

        return String.format("%s%s%s", "____", context.getStage(), "_____");
    }
}
