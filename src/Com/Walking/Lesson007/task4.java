package Com.Walking.Lesson007;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number < 0)
            System.out.println("it least at 0");

        System.out.println(getResult(number));

    }

    private static double getResult(int number) {
        return getResult(number, 1);
    }
    private static double getResult(double number, double minNumber) {

        if (minNumber == number)
            return Math.sqrt(minNumber);

        return Math.sqrt(minNumber + getResult(number, minNumber + 1));
    }
}
