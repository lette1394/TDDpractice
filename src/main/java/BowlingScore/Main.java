package BowlingScore;

import BowlingScore.Render.RenderContext;
import BowlingScore.Render.MiddleLine;
import BowlingScore.Render.TopLine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        renderTop();
        renderMiddle();
        renderBottom();
    }

    private static void renderTop() {
        RenderContext env = RenderContext.context();

        String line = TopLine.render(env);

        System.out.println(line);
    }

    private static void renderMiddle() {
        System.out.println(MiddleLine.render(10));
    }

    private static void renderBottom() {
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
