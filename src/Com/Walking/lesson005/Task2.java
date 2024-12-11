package Com.Walking.lesson005;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        for (int j = 0, sum = 0; j < array.length; j++) {

            if (j == 0) {
                sum = array[j] + array[array.length - 1];
                System.out.println(sum);
            } else {
                sum = array[j] + array[j - 1];
                System.out.println(sum);
            }
        }
    }
}
//package Com.Walking.lesson5;
//
//import java.util.Scanner;
//
///**
// * Создать массив int’ов из 5 элементов.
// * Заполнить его значениями, введенными с клавиатуры.
// * Вывести на экран сумму каждого значения с предыдущим.
// * Предыдущим значением для 0го элемента считать последнее значение массива.
// */
//public class Task2 {
//    public static void main(String[] args) {
//        int[] array = new int[5];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        scanner.close();
//
//        for (int i = 0; i < array.length; i++) {
//            int result;
//
//            if (i == 0) {
////                Складываем 0й элемент с последним
//                result = array[i] + array[array.length - 1];
//            } else {
////                Складываем текущий элемент с предыдущим
//                result = array[i] + array[i - 1];
//            }
//
//            System.out.println(result);
//        }
//    }
//}
