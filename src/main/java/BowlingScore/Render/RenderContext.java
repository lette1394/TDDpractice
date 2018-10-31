package BowlingScore.Render;

public class RenderContext {
    public static class RenderContextMaker {
        private RenderContext context;

        private RenderContextMaker() {
            context = new RenderContext();
        }

        public RenderContextMaker setStartNumber(Integer startNumber) {
            context.setStartNumber(startNumber);
            return this;
        }

        public RenderContextMaker setBlockWidth(Integer blockWidth) {
            context.setBlockWidth(blockWidth);
            return this;
        }

        public RenderContextMaker setVerticalDelimiter(String verticalDelimiter) {
            context.setVerticalDelimiter(verticalDelimiter);
            return this;
        }

        public RenderContextMaker setHorizontalDelimiter(String horizontalDelimiter) {
            context.setHorizontalDelimiter(horizontalDelimiter);
            return this;
        }

        public RenderContextMaker setPadding(String padding) {
            context.setPadding(padding);
            return this;
        }

        public RenderContext make(Integer stage) {
            RenderContext target = copy(context);
            target.setStage(stage);

            return target;
        }
    }

    private Integer startNumber = 1;
    private Integer blockWidth = 3;
    private Integer stage;

    private String verticalDelimiter = "|";
    private String horizontalDelimiter = "_";
    private String padding = " ";

    private RenderContext() {
    }

    private static RenderContext copy(RenderContext context) {
        RenderContext target = new RenderContext();

        target.setPadding(context.getPadding());
        target.setStartNumber(context.getStartNumber());
        target.setHorizontalDelimiter(context.getHorizontalDelimiter());
        target.setVerticalDelimiter(context.getVerticalDelimiter());
        target.setBlockWidth(context.getBlockWidth());
        target.setStage(context.getStage());

        return target;
    }

    public static RenderContextMaker getMaker() {
        return new RenderContextMaker();
    }

    String renderBottom() {
        RenderContext context = RenderContext.getMaker().make(3);
        Bottom bottom = Bottom.bottom().setRenderContext(context);

        return bottom.renderCeiling() + bottom.renderContents() + bottom.renderFloor();
    }

    Integer getStartNumber() {
        return startNumber;
    }

    Integer getBlockWidth() {
        return blockWidth;
    }

    Integer getStage() {
        return stage;
    }

    String getVerticalDelimiter() {
        return verticalDelimiter;
    }

    String getHorizontalDelimiter() {
        return horizontalDelimiter;
    }

    String getPadding() {
        return padding;
    }

    private void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    private void setBlockWidth(Integer blockWidth) {
        this.blockWidth = blockWidth;
    }

    private void setStage(Integer stage) {
        this.stage = stage;
    }

    private void setVerticalDelimiter(String verticalDelimiter) {
        this.verticalDelimiter = verticalDelimiter;
    }

    private void setHorizontalDelimiter(String horizontalDelimiter) {
        this.horizontalDelimiter = horizontalDelimiter;
    }

    private void setPadding(String padding) {
        this.padding = padding;
    }
}
