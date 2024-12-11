package Com.Walking.lesson003;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a num2: ");
        int num2 = scanner.nextInt();
        int res = 0;
        System.out.print("1.Сложение 2.Вычитание 3.Умножение \nВыберите номер операции: ");
        int operation = scanner.nextInt();
        scanner.close();

        switch (operation) {
            case 1:
                System.out.printf("Result: %d", res = num1 + num2);
                break;
            case 2:
                System.out.printf("Result: %d", res = num1 - num2);
                break;
            case 3:
                System.out.printf("Result: %d", res = num1 * num2);
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
        System.out.printf("\nRes: %d", res);
    }
}