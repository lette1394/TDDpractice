package BowlingScore.Render;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {
    static String generateStringXTimes(String str, Integer times) {
        return Stream.iterate(0, i -> i + 1)
                .limit(times)
                .map(i -> str)
                .reduce((a, b) -> a + b)
                .orElse("");
    }

    static String insertStringTo(String line, String score) {
        int mid = line.length() / 2;
        return line.substring(0, mid) + score + line.substring(mid + 1);
    }

    static String mergeStage(String left, String right) {
        String delimiter =
                "_\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|";

        List<String> targets = Arrays.asList(left, delimiter, right);

        return targets.stream().reduce(Util::mergeStageInner).orElse("");
    }

    private static String mergeStageInner(String left, String right) {
        List<String> leftLines = splitByLine(left);
        List<String> rightLines = splitByLine(right);

        return Stream.iterate(0, i -> i + 1)
                .limit(leftLines.size())
                .map(i -> leftLines.get(i) + rightLines.get(i))
                .collect(Collectors.joining("\n"));
    }

    private static List<String> splitByLine(String str) {
        return Arrays.asList(str.split("\n"));
    }
}
