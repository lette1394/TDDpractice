package Calculator;

import Calculator.context.Context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        int ret = Context.of(line)
                .split("\\+")
                .trim()
                .toInts()
                .sum();

        System.out.print(ret);
    }
}
