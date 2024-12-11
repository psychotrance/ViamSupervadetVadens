package Com.Walking.Lesson008.Counter;

public class Task {
    public static void main(String[] args) {
        Counter evenNumbers = new Counter("Even numbers");
        Counter oddNumbers = new Counter("Odd numbers", 0);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers.increace();
            } else {
                oddNumbers.decreace();
            }
        }
        printCounterValue(evenNumbers);
        printCounterValue(oddNumbers);
    }

    static void printCounterValue(Counter counter) {
        System.out.printf("%s: %d \n", counter.name, counter.counter);
    }
}