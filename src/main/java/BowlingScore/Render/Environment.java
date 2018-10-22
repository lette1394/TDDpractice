package BowlingScore.Render;

public class Environment {
    private Integer blockWidth = 3;
    private Integer totalStage = 10;
    private String delimiter = "|";

    private Environment() {
    }

    public static Environment env() {
        return new Environment();
    }

    public Environment setBlockWidth(Integer blockWidth) {
        this.blockWidth = blockWidth;

        return this;
    }

    public Environment setTotalStage(Integer totalStage) {
        this.totalStage = totalStage;

        return this;
    }

    public Environment setDelimiter(String delimiter) {
        this.delimiter = delimiter;

        return this;
    }

    public Integer getBlockWidth() {
        return blockWidth;
    }

    public Integer getTotalStage() {
        return totalStage;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
