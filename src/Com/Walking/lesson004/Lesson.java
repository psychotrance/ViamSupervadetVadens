package Com.Walking.lesson004;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
//        int population = 10000000;
//        int born = 14;
//        int dead = 8;
//
//        for (int year = 1; year <= 10; year++) {
//            population += population / 1000 * (born - dead);
//            System.out.print(year + " ");
//            System.out.print(born + " ");
//            System.out.print(dead + " \n" );
//            if (born > 7)
//                born--;
//            if (dead > 6) {
//                dead--;
//            }
//
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your cash: ");
//        float sum = scanner.nextFloat();
//        System.out.print("Enter a deadline in a months: ");
//        int months = scanner.nextInt();
//        scanner.close();
//        int i = months;
//
//        while (i > 0) {
//            sum += sum * 0.07;
//            i--;
//        }
//        System.out.printf("После %d месяцев сумма вклада составит %.3f", months, sum);
//
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.print(i * j + "\t");
//            }
//            System.out.println();
//        }

        for (int endButton = 0; endButton != 1; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter a second number: ");
            int num2 = scanner.nextInt();
            System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
            System.out.println("If you want to end this, press 1, if not - any button: ");
            endButton = scanner.nextInt();
            if (endButton == 1) {
                System.out.println("We've finished!");
                break;
            }
        }
    }
}
