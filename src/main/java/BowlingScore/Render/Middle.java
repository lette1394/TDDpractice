package BowlingScore.Render;

public class Middle {
    private Integer stage = 0;
    private String firstTryScore = " ";
    private String secondTryScore = " ";

    private Middle() {
    }

    public static Middle middle() {
        return new Middle();
    }

    public Middle setStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    public Middle setFirstTryScore(String firstTryScore) {
        this.firstTryScore = firstTryScore;
        return this;
    }

    public Middle setSecondTryScore(String secondTryScore) {
        this.secondTryScore = secondTryScore;
        return this;
    }

    public String render(Integer blockWidth) {
        String ret = "";

        ret += "|   |   |\n";
        ret += String.format("| %s %s %s |\n", firstTryScore, "|", secondTryScore);
        ret += "|___|___|";

        return ret;
    }
}
