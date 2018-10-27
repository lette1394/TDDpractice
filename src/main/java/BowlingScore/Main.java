package BowlingScore;

import BowlingScore.Render.Printer;
import BowlingScore.Render.RenderContext;
import BowlingScore.Render.RenderContext.RenderContextMaker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            in.readLine();

            RenderContextMaker maker = RenderContext.getMaker();

            Printer.printScoreBoard(maker.make(10));

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
