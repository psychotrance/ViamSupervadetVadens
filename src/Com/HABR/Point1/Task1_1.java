package Com.HABR.Point1;

public class Task1_1 {
    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        for (int k = 0; k < array.length; k++) {
            for (int i = 0, j = i + 1; j < array.length; i++, j++) {
                double secondNumber = array[j];
                if (array[i] > array[j]) {
                    array[j] = array[i];
                    array[i] = secondNumber;
                }
            }
        }
        for (double d : array) {
            System.out.printf("%.3f\n", d);
        }
    }
}
