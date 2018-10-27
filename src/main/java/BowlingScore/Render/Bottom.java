package BowlingScore.Render;

class Bottom implements Renderable {
    private Bottom() {}

    public static Bottom create() {
        return new Bottom();
    }

    @Override
    public String renderCeiling(RenderContext context) {
        return "       ";
    }

    @Override
    public String renderContents(RenderContext context) {
        return String.format("%3s%s%3s", "", "1", "");
    }

    @Override
    public String renderFloor(RenderContext context) {
        return renderCeiling(context);
    }
}
