package java_fundamentals.conditionals;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a valid number 1 or 2: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println("Your entered one.");
            case 2 -> System.out.println("Your entered two.");
            default -> System.out.println("Invalid number.");
        }

    }
}
