package Com.HABR.Point1;

public class Task1_0 {
    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        for (double d : array) {
            System.out.printf("%.2f\t", d );
        }
//        double max = array[0];
//        double min = array[0];
//        double avg = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//            if (min > array[i]) {
//                min = array[i];
//            }
//            avg += array[i] / array.length;
//
//        }
//        System.out.printf("max: %.2f", max);
//        System.out.printf("min: %.2f", min);
//        System.out.printf("avg: %.2f", avg);
    }
}
