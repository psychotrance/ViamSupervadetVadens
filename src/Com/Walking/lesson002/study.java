package Com.Walking.lesson002;

import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a name: ");
        String name = in.next();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input a weight: ");
        float weight = in.nextFloat();
        System.out.printf("Name: %s; Age: %d; Weight: %.2f", name, age, weight);

    }
}
