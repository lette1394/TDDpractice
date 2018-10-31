package BowlingScore.Render;

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

    }
}
