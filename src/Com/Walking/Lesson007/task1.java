package Com.Walking.Lesson007;

public class task1 {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bb";
        String c = "cccccc";
        String d = "dddd dd";

        System.out.println(getCommonString(a,b));
    }

    static String getCommonString(String... strings) {
        String s = "";
        for (String x : strings) {
            s += x + " ";
        }
        return s;
    }
}
