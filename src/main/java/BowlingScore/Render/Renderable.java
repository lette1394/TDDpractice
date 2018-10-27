package BowlingScore.Render;

interface Renderable {
    String renderCeiling(RenderContext context);

    String renderContents(RenderContext context);

    String renderFloor(RenderContext context);
}
 