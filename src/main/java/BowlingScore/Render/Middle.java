package BowlingScore.Render;

import BowlingScore.StageScore;

import static BowlingScore.Render.Util.generateStringXTimes;
import static BowlingScore.Render.Util.insertStringTo;

final class Middle {
    RenderContext context;

    private Middle(RenderContext context) {
        this.context = context;
    }

    static Middle middle(RenderContext context) {
        return new Middle(context);
    }

    String renderCeiling(StageScore score) {
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

    String renderScore(StageScore score) {
        Integer stage = score.getStage();
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

    String renderFloor(StageScore score) {
        Integer stage = score.getStage();
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
