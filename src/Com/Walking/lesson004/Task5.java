package Com.Walking.lesson004;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a num: ");
//        int number = scanner.nextInt();
//
//        while (number != 1) {
//            System.out.println("You didn't guess!");
//            System.out.print("Enter a num: ");
//            number = scanner.nextInt();
//        }
//        System.out.println("End");
        int number;
        do {
            System.out.println("You didn't guess!");
            System.out.print("Enter a num: ");
            number = scanner.nextInt();
        } while (number != 1);
        System.out.println("End");
    }
}
