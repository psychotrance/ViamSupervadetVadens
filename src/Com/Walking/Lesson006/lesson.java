package Com.Walking.Lesson006;

public class lesson {
    public static void main(String[] args) {
        int x = sum(1, 2, 3);
        int y = sum(1, 4, 9);
        System.out.println(x);
        System.out.println(y);
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
