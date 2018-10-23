package BowlingScore;

import BowlingScore.Render.Render;
import BowlingScore.Render.RenderContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            in.readLine();

            RenderContext context = RenderContext.context();

            Render.render(context);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
