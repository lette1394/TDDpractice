package BowlingScore;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            in.readLine();

            System.out.print("|");
            System.out.print(String.format("%2s %s %2s", "", "1", ""));
            System.out.print("|");
            System.out.print(String.format("%2s %s %2s", "", "2", ""));
            System.out.print("|");
            System.out.print(String.format("%2s %s %2s", "", "3", ""));
            System.out.print("|");
            System.out.print(String.format("%2s %s %2s", "", "4", ""));
            System.out.print("|");
            System.out.print(String.format("%2s %s %2s", "", "5", ""));
            System.out.print("|");
            System.out.print(String.format("%2s %s %2s", "", "6", ""));
            System.out.print("|");

            System.out.println();



        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }
}
