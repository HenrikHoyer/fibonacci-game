public class Test {

    // public static int count = 0;

    public static int f(int n) {
        // count ++;
        if(n > 1) {
            return f(n - 1) + f(n -2);
        }
        return 1;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int result = f(40);
        long time = System.currentTimeMillis() - start;
        System.out.println(result);
        System.out.println(time);
        // System.out.println(count);
    }
}
