package BowlingScore.Render;

import BowlingScore.StageScore;

import static BowlingScore.Render.Util.generateStringXTimes;
import static BowlingScore.Render.Util.insertStringTo;

final class Middle implements Renderable {
    private RenderContext context;
    private StageScore score;

    private Middle() {
    }

    static Middle middle() {
        return new Middle();
    }

    Middle setRenderContext(RenderContext context) {
        this.context = context;
        return this;
    }

    Middle setStageScore(StageScore score) {
        this.score = score;
        return this;
    }

    @Override
    public String renderCeiling() {
        Integer stage = score.getStage();
        Integer blockWidth = context.getBlockWidth();

        if (stage == 10) {
            return String.join("|",
                    generateStringXTimes(" ", blockWidth),
                    generateStringXTimes(" ", blockWidth),
                    generateStringXTimes(" ", blockWidth));
        }

        return String.join("|",
                generateStringXTimes(" ", blockWidth),
                generateStringXTimes(" ", blockWidth));
    }

    @Override
    public String renderContents() {
        Integer stage = context.getStage();
        Integer blockWidth = context.getBlockWidth();

        String first = score.getFirstTryScore();
        String second = score.getSecondTryScore();
        String third = score.getThirdTryScore();

        String basis = generateStringXTimes(" ", blockWidth);

        if (stage == 10) {
            return String.join("|",
                    insertStringTo(basis, first),
                    insertStringTo(basis, second),
                    insertStringTo(basis, third));
        }

        return String.join("|",
                insertStringTo(basis, first),
                insertStringTo(basis, second));
    }

    @Override
    public String renderFloor() {
        Integer stage = context.getStage();
        Integer blockWidth = context.getBlockWidth();

        if (stage == 10) {
            return String.join("|",
                    generateStringXTimes("_", blockWidth),
                    generateStringXTimes("_", blockWidth),
                    generateStringXTimes("_", blockWidth));
        }

        return String.join("|",
                generateStringXTimes("_", blockWidth),
                generateStringXTimes("_", blockWidth));
    }
}
