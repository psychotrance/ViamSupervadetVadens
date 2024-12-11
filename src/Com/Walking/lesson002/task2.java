package Com.Walking.lesson002;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        boolean c = a * a * a > b * b;
        System.out.println(c);
    }
}
