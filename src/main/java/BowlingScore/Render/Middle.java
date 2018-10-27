package BowlingScore.Render;

import BowlingScore.Render.RenderContext;
import BowlingScore.StageScore;

import static BowlingScore.Render.Util.generateStringXTimes;
import static BowlingScore.Render.Util.insertStringTo;

public class Middle {
    private Middle() {
    }

    public static String renderCeiling(RenderContext context, StageScore score) {
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

    public static String renderScore(RenderContext context, StageScore score) {
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

    public static String renderFloor(RenderContext context, StageScore score) {
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
