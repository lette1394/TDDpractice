package BowlingScore.Render;

public class StageLine {
    private Integer stage;

    public static StageLine stageLine(Integer stage) {
        return new StageLine(stage);
    }

//    public String render(Integer limit, Integer blockWidth) {
//        return Stream.iterate(1, i -> i+1).limit(limit).map()
//    }

    public String render(Integer blockWidth) {
        return String.format("%s%s%s", this.renderLeft(blockWidth), stage, this.renderRight(blockWidth));
    }

    private StageLine(Integer stage) {
        this.stage = stage;
    }

    private String renderLeft(Integer blockWidth) {
        if (stage < 10) {
            return getUnderScoreOneDigit(blockWidth);

        }
        return getUnderScoreTwoDigitLeft(blockWidth);
    }

    private String getUnderScoreTwoDigitLeft(Integer width) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < width + 1; i++) {
            sb.append("_");
        }
        return sb.toString();

    }

    private String renderRight(Integer blockWidth) {
        if (stage < 10) {
            return getUnderScoreOneDigit(blockWidth);

        }
        return getUnderScoreTwoDigitRight(blockWidth);
    }

    private String getUnderScoreTwoDigitRight(Integer width) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < width + 2; i++) {
            sb.append("_");
        }
        return sb.toString();
    }

    private String getUnderScoreOneDigit(int width) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < width; i++) {
            sb.append("_");
        }
        return sb.toString();

    }
}
