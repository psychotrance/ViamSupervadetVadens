package Com.Walking.Lesson006;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length of a rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter a width of a rectangle: ");
        int width = scanner.nextInt();
        scanner.close();

        System.out.println(getFigure(length, width));
    }

    private static String getFigure(int length, int width) {
        return getHorizontalLine(length) + getVerticalLies(length, width) + getHorizontalLine(length);
    }

    private static String getHorizontalLine(int length) {
        String horizontalLine = " ";
        for (int l = length; l > 0; l--) {
            horizontalLine += "-";
        }
        return horizontalLine += "\n";
    }

    private static String getVerticalLies(int length, int width) {
        String verticalLines = "";
        String verticalLineUnit ="";
        verticalLineUnit += "|";

        for (int l = length; l > 0; l--) {
            verticalLineUnit += " ";
        }
        verticalLineUnit += "|\n";

        for (int w = width; w > 0; w--) {
            verticalLines += verticalLineUnit;
        }
        return verticalLines;
    }
}
