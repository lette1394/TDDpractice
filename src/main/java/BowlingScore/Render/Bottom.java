package BowlingScore.Render;

class Bottom implements Renderable {
    private RenderContext context;

    private Bottom() {
    }

    static Bottom bottom() {
        return new Bottom();
    }

    Bottom setRenderContext(RenderContext context) {
        this.context = context;
        return this;
    }

    @Override
    public String renderCeiling() {
        if (context.getStage() < 10) {
            return "       ";
        }

        return "           ";
    }

    @Override
    public String renderContents() {
        if (context.getStage() < 10) {
            return String.format("%3s%s%3s", "", context.getStage(), "");
        }

        return String.format("%4s%s%5s", "", context.getStage(), "");
    }

    @Override
    public String renderFloor() {
        if (context.getStage() < 10) {
            return "_______";
        }

        return "___________";
    }
}
