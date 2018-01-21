public class Main {
    public static void main(String[] args) {
        System.out.println(fib(52));
    }

    static long fib(int n) {
        if (n <= 51) {
            if (n == 1 || n == 2) {
                return 1;
            }
            return fib(n - 2) + fib(n - 1);
        } else {
            long arr[] = new long[n];
            for (int i = 3; i < arr.length; i++) {
                arr[0] = 1;
                arr[1] = 1;
                arr[2] = arr[0] + arr[1];
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n - 1];

        }

    }
}
