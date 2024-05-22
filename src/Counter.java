import exceptions.InvalidParamsException;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter param1: ");
        int param1 = scanner.nextInt();

        System.out.println("Enter param2: ");
        int param2 = scanner.nextInt();

        try {
            count(param1, param2);
        } catch (InvalidParamsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void count(int param1, int param2) throws InvalidParamsException {
        if (param1 > param2) {
            throw new InvalidParamsException("The second parameter must be greater than the first");
        }

        int counter = param2 - param1;

        for (int i = 1; i <= counter; i++) {
            System.out.println("Count: " + i);
        }
    }
}