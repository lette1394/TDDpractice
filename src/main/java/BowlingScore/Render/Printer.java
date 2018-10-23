package BowlingScore.Render;

public class Printer {
    public static void printScoreBoard(RenderContext context) {
        printTop(context);
        printMiddle(context);
        printBottom(context);
    }

    private static void printTop(RenderContext context) {
        String line = TopLine.render(context);

        System.out.println(line);
    }

    private static void printMiddle(RenderContext context) {
        String line = MiddleLine.render(context.getTotalStage());

        System.out.println(line);
    }

    private static void printBottom(RenderContext context) {
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
