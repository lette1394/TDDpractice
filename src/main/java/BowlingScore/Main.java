package BowlingScore;

import BowlingScore.Render.Printer;
import BowlingScore.Render.RenderContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            in.readLine();

            RenderContext context = RenderContext.context();

            Printer.printScoreBoard(context);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
