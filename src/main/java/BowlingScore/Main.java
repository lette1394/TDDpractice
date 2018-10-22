package BowlingScore;

import BowlingScore.Render.Environment;
import BowlingScore.Render.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Environment.setBlockWidth(3);

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
        System.out.print(" ");
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%8s", "________"));
        System.out.print(String.format("%9s", "___________"));
        System.out.println();

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(Stage::stage)
                .forEach(stage -> {
                    System.out.println("|");
                    System.out.print(stage.render(3));
                });
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "1", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "2", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "3", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "4", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "5", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "6", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "7", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "8", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%3s%s%3s", "___", "9", "___"));
//        System.out.print("|");
//        System.out.print(String.format("%4s%s%4s", "____", "10", "_____"));
//        System.out.print("|");

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
