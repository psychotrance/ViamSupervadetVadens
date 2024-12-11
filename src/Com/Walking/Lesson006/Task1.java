package Com.Walking.Lesson006;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to say? ");
        String phrase = scanner.nextLine();
        scanner.close();

        askHim(phrase);
    }

    private static void askHim(String phrase) {
        switch (phrase) {
            case "Hi":
                doAnswer("Hello");
                break;
            case "How are you?":
                doAnswer("How are you doing?");
                break;
            case "Bye":
                doAnswer("Good bye");
                break;
            default:
                doAnswer("Unknown message");

        }
    }

    private static void doAnswer(String phrase) {
        System.out.println(phrase);
    }
}
