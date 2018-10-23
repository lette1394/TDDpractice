package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Arrays;
import java.util.List;

import static BowlingScore.StageScore.stageScore;

public class Printer {
    public static void printScoreBoard(RenderContext context) {
        printTop(context);
        printMiddle(context);
        printBottom(context);
    }

    private static void printTop(RenderContext context) {
        String line = TopLine.render(context);

        System.out.println(line);
    }

    private static void printMiddle(RenderContext context) {
        List<StageScore> scoreList = Arrays.asList(
                stageScore(1, "9", "/"),
                stageScore(2, "X", " "),
                stageScore(3, "X", " "),
                stageScore(4, "9", "8"),
                stageScore(5, "9", "-"),
                stageScore(6, "9", "8"),
                stageScore(7, "9", "8"),
                stageScore(8, "9", "8"),
                stageScore(9, "9", "8"),
                stageScore(10, "a", "b", "c")
                );

        String line = MiddleLine.render(context, scoreList);

        System.out.println(line);
    }

    private static void printBottom(RenderContext context) {
        System.out.print("|");
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%8s", "|"));
        System.out.print(String.format("%12s", "|"));
        System.out.println();

        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "1", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "2", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "3", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "4", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "5", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "6", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "7", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "8", ""));
        System.out.print("|");
        System.out.print(String.format("%3s%s%3s", "", "9", ""));
        System.out.print("|");
        System.out.print(String.format("%4s%s%5s", "", "10", ""));
        System.out.print("|");
        System.out.println();

        System.out.print("|");
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%8s", "_______|"));
        System.out.print(String.format("%9s", "___________|"));
        System.out.println();
    }
}
