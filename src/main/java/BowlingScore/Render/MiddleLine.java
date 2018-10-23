package BowlingScore.Render;

import java.util.Arrays;
import java.util.List;

public class MiddleLine {
    public static String render(int limit) {
        StringBuilder sb = new StringBuilder();

        sb.append("|");
        for (int i = 0; i < limit-1; i++) {
            sb.append(String.format("%s", "   |   |"));
        }
        sb.append(String.format("%s", "   |   |   |"));
        sb.append("\n");


        List<String> scores = Arrays.asList("9", "/", "X", " ", "X", " ", "9", "8", "9", "-", "9", "8", "9", "8", "9", "8", "9", "8");
        sb.append("|");
        for (int i = 0; i < limit-1; i++) {
            sb.append(String.format(" %s %s %s ", scores.get(i * 2), "|", scores.get(i * 2 + 1)));
            sb.append("|");
        }
        sb.append(String.format(" %s %s %s %s %s ", "a", "|", "b", "|", "c"));
        sb.append("|");
        sb.append("\n");


        sb.append("|");
        for (int i = 0; i < limit-1; i++) {
            sb.append(String.format("%s", "___|___|"));
        }
        sb.append(String.format("%s", "___|___|___|"));

        return sb.toString();
    }
}
