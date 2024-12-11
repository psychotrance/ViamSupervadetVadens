package Com.Walking.Lesson008.Counter;

public class Counter {
    public String name;
    public int counter;

    Counter(String n) {
        this(n, 0);
    }

    Counter(String n, int c) {
        name = n;
        counter = c;
    }

    public int increace() {
        return ++counter;
    }

    public int increace(int addingValue) {
        return this.counter += addingValue;
    }

    public int decreace() {
        return --counter;
    }
}
//    Counter(String name) {
//        this(name, 0);
//    }
//
//    Counter(String name, int counter) {
//        this.name = name;
//        this.counter = counter;
//    }
//
//    public int increment() {
//        return ++counter;
//    }
//    public  int decrement() {
//        return --counter;
//    }
//
//    public int increace(int value) {
//        counter += value;
//        return counter;
//    }
//
//    public int decreace(int value) {
//        counter -= value;
//        return counter;
//    }
//}
