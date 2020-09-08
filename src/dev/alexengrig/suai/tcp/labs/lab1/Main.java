package dev.alexengrig.suai.tcp.labs.lab1;

public class Main {
    public static void main(String[] args) {
        for (int number = 0; number < 10; number++) {
            int expected = 2 * number;
            int actual = doubleUp(number);
            System.out.println("2 * " + number + " = " + expected + "\t(" + (expected == actual) + ")");
        }
    }

    private static int doubleUp(int number) {
        if (number == 0) {
            return 0;
        }
        return 2 + doubleUp(number - 1);
    }
}
