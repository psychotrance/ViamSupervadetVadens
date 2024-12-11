package Com.Walking.Lesson007;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number < 0) {
            System.out.println("Number can't be least then 0");
            return;
        }
        System.out.println(calculateFactorial(number));

    }
    static long calculateFactorial(int num) {
        if (num == 0)
            return 1;
        if (num == 1)
            return 1;
        return num * calculateFactorial(num - 1);
    }
}