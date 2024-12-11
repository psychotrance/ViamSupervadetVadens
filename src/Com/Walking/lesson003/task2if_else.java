package Com.Walking.lesson003;

import java.util.Scanner;

public class task2if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to say? ");
        String phrase = in.nextLine();
        in.close();

        if ("Hi".equals(phrase))
            System.out.println("Hello");
        else if ("How are you?".equals(phrase))
            System.out.println("How are you doing?");
        else if ("Bye".equals(phrase))
            System.out.println("Good bye!");
        else
            System.out.println("Unknown message");
    }
}
