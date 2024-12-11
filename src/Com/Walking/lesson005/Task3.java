package Com.Walking.lesson005;

public class Task3 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        for (int i = 0; i < primeNumbers.length; i++) {
            boolean numberIsFind = false;

            if (i == 0) {
                primeNumbers[i] = 2;
            } else if (i == 1) {
                primeNumbers[i] = 3;
            } else {
                int numberCounter = primeNumbers[i - 1];
                int leftOver;

                while (!numberIsFind){
                    numberCounter += 2;

                    for (int index = i; index > 0; index--) {
                        leftOver = numberCounter % primeNumbers[index - 1];

                        if (leftOver != 0 && index == 1) {
                            primeNumbers[i] = numberCounter;
                            numberIsFind = true;
                        } else if (leftOver != 0) {
                            continue;
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println(primeNumbers[i]);
        }
        int sumSimpleNums = 0;

        for (int x : primeNumbers) {
            sumSimpleNums += x;
        }
        System.out.println(sumSimpleNums);
    }
}
