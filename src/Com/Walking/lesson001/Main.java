package Com.Walking.lesson001;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Значение а: " + a + ",  Значение b: " + b);


        String name = """ 
                A
                l
                e
                x
                e
                y""";
        System.out.println(name);

        char c = 'A';
        System.out.print(c);
        System.out.print("\n");
         c = 'l';
        System.out.print(c);
        System.out.print("\n");
         c = 'e';
        System.out.print(c);
        System.out.print("\n");
         c = 'x';
        System.out.print(c);
        System.out.print("\n");
         c = 'e';
        System.out.print(c);
        System.out.print("\n");
         c = 'y';
        System.out.print(c);
    }
}