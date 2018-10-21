package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String line = readLineFromStdIn();

        System.out.print(sum(line));
    }

    private static String readLineFromStdIn() {
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
            return in.readLine();
        } catch (Exception e) {
            System.err.println(e.toString());
            return "";
        }
    }

    private static int sum(String line) {
        return sum(toInts(splitInDelimiter(line)));
    }

    private static Integer sum(Collection<Integer> numbers) {
        return numbers.stream().reduce((a, b) -> a + b).orElse(0);
    }

    private static Collection<String> splitInDelimiter(String line) {
        String delimiter = ":";

        String[] splited = line.split(delimiter);

        return Arrays.asList(splited);
    }

    private static Collection<Integer> toInts(Collection<String> collection) {
        return collection.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

}
