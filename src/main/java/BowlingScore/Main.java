package BowlingScore;

import BowlingScore.Render.Environment;
import BowlingScore.Render.StageLine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            in.readLine();

            render();

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private static void render() {
        renderStage();
        renderCurrentStageResult();
        renderAccumulatedScore();
    }

    private static void renderStage() {
        System.out.println(Stream.iterate(0, i -> i + 1)
                .limit(9)
                .map(i -> String.format("%8s", "________"))
                .reduce((a,b) -> a+b)
                .map(last -> " " + last + "___________")
                .orElse(""));
        
        Environment env = Environment.env();
        System.out.print(StageLine.render(env));
        System.out.println();
    }

    private static void renderCurrentStageResult() {
        System.out.print("|");
        System.out.print(String.format("%s", "   |   |"));
        System.out.print(String.format("%s", "   |   |"));
        System.out.print(String.format("%s", "   |   |"));
        System.out.print(String.format("%8s", "   |   |"));
        System.out.print(String.format("%8s", "   |   |"));
        System.out.print(String.format("%8s", "   |   |"));
        System.out.print(String.format("%8s", "   |   |"));
        System.out.print(String.format("%8s", "   |   |"));
        System.out.print(String.format("%8s", "   |   |"));
        System.out.print(String.format("%9s", "   |   |   |"));
        System.out.println();

        System.out.print("|");
        System.out.print(String.format(" %s %s %s ", "9", "|", "/"));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "X", "|", " "));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "X", "|", " "));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "9", "|", "8"));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "9", "|", "-"));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "9", "|", "8"));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "9", "|", "8"));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "9", "|", "8"));
        System.out.print("|");
        System.out.print(String.format("%2s %s %-2s", "9", "|", "8"));
        System.out.print("|");
        System.out.print(String.format("%2s %s %1s %s %1s ", "a", "|", "b", "|", "c"));
        System.out.print("|");
        System.out.println();

        System.out.print("|");
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%8s", "___|___|"));
        System.out.print(String.format("%9s", "___|___|___|"));
        System.out.println();
    }

    private static void renderAccumulatedScore() {
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
