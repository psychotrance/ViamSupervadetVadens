package Com.Walking.Lesson007;

import com.sun.source.tree.BreakTree;

public class task5 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        for (int i = 0; i < primeNumbers.length; i++) {

            if (i == 0) {
                primeNumbers[i] = 2;
                continue;
            } else if (i == 1) {
                primeNumbers[i] = 3;
                continue;
            }
            int primeNumber = primeNumbers[i - 1];
            primeNumbers[i] = findPrimeNumber(primeNumbers, i, primeNumber + 2);
        }

        for (int x : primeNumbers) {
            System.out.print(x + " \t");
        }
        System.out.println("\n" + sum(primeNumbers));
    }
    /*
    сначала
    дать первичное число для поиска простого числа (начальное)
    передать метод с аргументами нужными (подумать над параметрами)


    деление на остаток найденного простого числа на предыдущее простое число
    если
    остаток == 0 - добавить добавочное значение и рекурсировать метод.

     */


    static int findPrimeNumber(int[] array, int i, int primeNumber) {
        boolean isPrimeNumber = false;
        return findPrimeNumber(array, i, primeNumber, isPrimeNumber);
    }

    static int findPrimeNumber(int[] array, int i, int primeNumber, boolean isPrimeNumber) {
        int leftOver = primeNumber % array[i - 1];

        if (i - 1 == 0) {
            return primeNumber;
        }
        if (leftOver == 0) {
            return findPrimeNumber(array, i, primeNumber + 2, isPrimeNumber);
        }
        return findPrimeNumber(array, i - 1, primeNumber, isPrimeNumber);
    }

    static int sum(int[] array) {
        return sum(array, 0);
    }

    static int sum(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        }
        return array[i] + sum(array, i + 1);
    }
}
