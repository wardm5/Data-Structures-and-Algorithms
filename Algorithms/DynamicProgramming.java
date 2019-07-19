public class DynamicProgramming {
    public DynamicProgramming() {}
    public int fib(int n) {
        int[] arr = new int[n + 1];
        return fibHelper(n, arr);
    }
    public int fibHelper(int n, int[] arr) {
        if (n <= 1)
            arr[0] = 1;
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
    public int factorial(int n) {
        int[] arr = new int[n + 1];
        if (n <= 1)
            arr[0] = 1;
        arr[0] = 1;
        return factorialHelper(n, arr);

    }
    private int factorialHelper(int n, int[] arr) {
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] * i;
        }
        return arr[n];
    }
    /*
        We are given two strings: string S of length n, and string T of length m. Our goal is to produce their
        longest common subsequence: the longest sequence of characters that appear left-to-right (but not
        necessarily in a contiguous block) in both strings.
     */
}
