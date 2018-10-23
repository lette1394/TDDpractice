package BowlingScore.Render;

public class RenderContext {
    private Integer startNumber = 1;
    private Integer blockWidth = 3;
    private Integer totalStage = 10;
    private String verticalDelimiter = "|";
    private String horizontalDelimiter = "_";
    private String padding = " ";

    private RenderContext() {
    }

    public static RenderContext context() {
        return new RenderContext();
    }

    public Integer getStartNumber() {
        return startNumber;
    }

    public RenderContext setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    public RenderContext setBlockWidth(Integer blockWidth) {
        this.blockWidth = blockWidth;
        return this;
    }

    public RenderContext setTotalStage(Integer totalStage) {
        this.totalStage = totalStage;
        return this;
    }

    public RenderContext setVerticalDelimiter(String verticalDelimiter) {
        this.verticalDelimiter = verticalDelimiter;
        return this;
    }

    public RenderContext setHorizontalDelimiter(String horizontalDelimiter) {
        this.horizontalDelimiter = horizontalDelimiter;
        return this;
    }

    public RenderContext setPadding(String padding) {
        this.padding = padding;
        return this;
    }

    public Integer getBlockWidth() {
        return blockWidth;
    }

    public Integer getTotalStage() {
        return totalStage;
    }

    public String getVerticalDelimiter() {
        return verticalDelimiter;
    }

    public String getHorizontalDelimiter() {
        return horizontalDelimiter;
    }

    public String getPadding() {
        return padding;
    }


}
