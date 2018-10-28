package BowlingScore.Render;

class Bottom implements Renderable {
    private RenderContext context;

    private Bottom(){}

    static Bottom bottom(RenderContext context) {
        return new Bottom().setRenderContext(context);
    }

    private Bottom setRenderContext(RenderContext context) {
        this.context = context;
        return this;
    }

    @Override
    public String renderCeiling() {
        return "       ";
    }

    @Override
    public String renderContents() {
        return String.format("%3s%s%3s", "", "1", "");
    }

    @Override
    public String renderFloor() {
        return renderCeiling();
    }
}
