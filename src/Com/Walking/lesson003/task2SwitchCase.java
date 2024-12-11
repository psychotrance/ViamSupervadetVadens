package Com.Walking.lesson003;

import java.util.Scanner;

public class task2SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to say? ");
        String phrase = scanner.nextLine();
        scanner.close();

        switch (phrase) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "How are you?":
                System.out.println("How are you doing?");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            default:
                System.out.println("Unknown message");

        }
    }
}
