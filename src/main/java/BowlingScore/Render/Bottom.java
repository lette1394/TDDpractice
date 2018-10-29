package BowlingScore.Render;

class Bottom implements Renderable {
    private RenderContext context;

    private Bottom(){}

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

    }

    @Override
    public String renderContents() {
        return String.format("%3s%s%3s", "", context.getStage(), "");
    }

    @Override
    public String renderFloor() {
        return "_______";
    }
}
