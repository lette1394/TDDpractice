package BowlingScore.Render;

import BowlingScore.StageScore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static BowlingScore.StageScore.stageScore;

public class Printer {
    public static void printScoreBoard(RenderContext context) {
        printTop(context);
        printMiddle(context);
        printBottom(context);
    }

    private static void printTop(RenderContext context) {
        String line = TopLine.render(context);
        print(line);
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

        RenderContext.RenderContextMaker maker = RenderContext.getMaker();
        List<RenderContext> contextList = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .map(maker::make)
                .collect(Collectors.toList());

        String line = MiddleLine.render(contextList, scoreList);
        print(line);
    }

    private static void printBottom(RenderContext context) {
        RenderContext.RenderContextMaker maker = RenderContext.getMaker();
        List<RenderContext> contextList = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .map(maker::make)
                .collect(Collectors.toList());

        String line = BottomLine.render(contextList);
        System.out.println(line);
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
