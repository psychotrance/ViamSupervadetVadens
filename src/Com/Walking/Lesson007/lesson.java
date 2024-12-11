package Com.Walking.Lesson007;

public class lesson {
    public static void main(String[] args) {

        System.out.println(Math.sqrt(5));
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static int factorial(int x) {
        if (x == 1)
            return 1;
        return x * factorial(x - 1);
    }

    static int factorial2(int x) {
        int result = 1;
        for (int i = 1; i < x; i++)
            result *= i;
        return result;
    }

    static int fibonachi(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return fibonachi(n - 1) + fibonachi(n - 2);
    }
}
