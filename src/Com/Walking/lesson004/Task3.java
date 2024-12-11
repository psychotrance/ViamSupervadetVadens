package Com.Walking.lesson004;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length of a rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter a width of a rectangle: ");
        int width = scanner.nextInt();
        scanner.close();

        final String LENGTH = "-";
        final String WIDTH = "|";
        final String SPACE = " ";
        String horizontalLine = SPACE;
        String verticalLines = "";
        String verticalLine = "";

        for (int i = length; i > 0; i--) {
            horizontalLine += LENGTH;
        }
        horizontalLine += '\n';

            verticalLine += WIDTH;
            for (int j = length; j > 0; j--) {
                verticalLine += SPACE;
            }
            verticalLine += WIDTH + '\n';
        for (int k = width; k > 0; k--)
            verticalLines += verticalLine;

        System.out.println(horizontalLine + verticalLines + horizontalLine);
    }
}
