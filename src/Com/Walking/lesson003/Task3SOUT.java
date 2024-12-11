package Com.Walking.lesson003;

import java.util.Scanner;

public class Task3SOUT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите своё имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите свою фамилию: ");
        String secondName = scanner.nextLine();
        System.out.print("Введите своё отчество: ");
        String middleName = scanner.nextLine();

        System.out.print(firstName + " " + secondName + " " + middleName);
    }
}
