package dev.alexengrig.suai.tcp.labs.lab1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterative:");
        for (int number = 0; number < 10; number++) {
            int expected = 2 * number;
            System.out.println("2 * " + number + " = " + expected +
                    "\t(" + (expected == doubleUpIterative(number)) + ")");
        }
        System.out.println("Recursive:");
        for (int number = 0; number < 10; number++) {
            int expected = 2 * number;
            System.out.println("2 * " + number + " = " + expected +
                    "\t(" + (expected == doubleUpRecursive(number)) + ")");
        }
    }

    private static int doubleUpIterative(int number) {
        int result = 0;
        for (int current = number; current > 0; current--) result += 2;
        return result;
    }

    private static int doubleUpRecursive(int number) {
        if (number == 0) return 0;
        return 2 + doubleUpRecursive(number - 1);
    }
}
