package BowlingScore;

public class StageScore {
    private Integer stage;
    private String firstTryScore;
    private String secondTryScore;
    private String thirdTryScore;

    private StageScore() {
    }

    public static StageScore stageScore(Integer stage, String firstTryScore, String secondTryScore) {
        return new StageScore()
                .setStage(stage)
                .setFirstTryScore(firstTryScore)
                .setSecondTryScore(secondTryScore);
    }

    private static boolean isFinalStage(Integer stage) {
        return stage == 10;
    }

    public static StageScore stageScore(Integer stage, String firstTryScore, String secondTryScore, String thirdScore) {
        if (isFinalStage(stage)) {
            return new StageScore()
                    .setStage(stage)
                    .setFirstTryScore(firstTryScore)
                    .setSecondTryScore(secondTryScore)
                    .setThirdTryScore(thirdScore);
        }
        throw new IllegalArgumentException();
    }

    private StageScore setStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    private StageScore setFirstTryScore(String firstTryScore) {
        this.firstTryScore = firstTryScore;
        return this;
    }

    private StageScore setSecondTryScore(String secondTryScore) {
        this.secondTryScore = secondTryScore;
        return this;
    }

    private StageScore setThirdTryScore(String thirdTryScore) {
        this.thirdTryScore = thirdTryScore;
        return this;
    }

    public Integer getStage() {
        return stage;
    }

    public String getFirstTryScore() {
        return firstTryScore;
    }

    public String getSecondTryScore() {
        return secondTryScore;
    }

    public String getThirdTryScore() {
        return thirdTryScore;
    }
}
