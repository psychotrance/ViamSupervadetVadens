package Com.Walking.lesson002;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = b * a * (a + b) / (a * a);
        System.out.printf("%.2f", c);
    }
}
