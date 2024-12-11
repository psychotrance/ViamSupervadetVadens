package Com.Walking.lesson003;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first num: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter a second num: ");
        double num2 = scanner.nextDouble();
        scanner.close();
        double res;

        if (num1 == num2)
            System.out.print("Numbers are equals");
        else if (num1 % 2 == 0) {
            res = num1 * num2;
            System.out.printf("%.0f * %.0f = %.2f", num1, num2, res);
        } else if (num1 % 2 != 0) {
            res = num1 / num2;
            System.out.printf("%.0f * %.0f = %.2f", num1, num2, res);
        }
    }
}
