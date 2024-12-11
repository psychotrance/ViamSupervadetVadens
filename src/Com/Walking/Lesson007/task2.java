package Com.Walking.Lesson007;

public class task2 {
    public static void main(String[] args) {
        System.out.println(sum((byte) 1, (byte) 5, (byte) 126));
        System.out.println(sum(4.2, 4.5));
    }

    static byte sum(byte... numbers) {
        byte result = 0;

        for (byte x : numbers) {
            if (Byte.MIN_VALUE > result || result > Byte.MAX_VALUE) {
                System.out.println("Result is too much!");
                return result;
            }
            result += x;
        }
        return (byte) result;
    }

    static short sum(short... numbers) {
        long result = 0;
        for (short x : numbers) {
            result += x;
            if (Short.MIN_VALUE > result || result > Short.MAX_VALUE) {
                System.out.println("Result is too much!");
            }
        }
        return (short) result;
    }

    static int sum(int... numbers) {
        long result = 0;
        for (int x : numbers) {
            result += x;
            if (Integer.MIN_VALUE > result || result > Integer.MAX_VALUE) {
                System.out.println("Result is too much!");
            }
        }
        return (int) result;
    }

    static long sum(long... numbers) {
        long result = 0;

        for (long x : numbers) {
            result += x;
        }
        return result;
    }

    static double sum(double... numbers) {
        double result = 0;

        for (double x : numbers) {
            result += x;
        }
        return result;
    }

    static float sum(float... numbers) {
        float result = 0;

        for (float x : numbers) {
            result += x;
        }
        return result;
    }

    static String sum(char... arrChars) {
        String result = "";

        for (char x : arrChars) {
            result += x;
        }
        return result;
    }

    static boolean sum(boolean... arrBools) {
        boolean result = true;
        for (boolean x : arrBools) {
            result &= x;
        }
        return result;
    }
}
