package Com.Walking.Lesson008;

public class lesson {
    public static void main(String[] args) {

//        Person bob = new Person();
//        bob.displayInfo();
//
//        Person tom = new Person("Tom");
//        tom.displayInfo();
//
//        Person sam = new Person("Sam", 25);
//        sam.displayInfo();
//        Person person = new Person();
//        person.name = "Tomas";
//        person.name += " Angelo";
//
//        System.out.print(person.name);


        Car car = new Car("Red");
        method1(car);
        System.out.println(car.color);

    }

    static void method1(Car car) {
        car = new Car("Blue");
//        car.color = "Blue";
        System.out.println(car.color);
    }
}

//class Person {
//    public String name;
//    public int age;
//
//    Person() {
//        this("Undefined", 18);
//    }
//    Person(String name) {
//        this(name, 22);
//    }
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public void displayInfo() {
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }
//}
class Car {
    public String color;
    public int maxSpeed;

    Car(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car(String color) {
        this(color, 230);
    }
}
