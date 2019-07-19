import java.util.*;

/*
    This file is focused on solving Dynamic Programming questions for interview situations and fun practice :D
    Note:   methods will have the problem, underscore, and either TAB or MEMO denoting what type of dynamic programming
            strategy I used for the method.
 */

public class DynamicProgramming {
    public DynamicProgramming() {}
    public int fibonacci_TAB(int n) {
        int[] arr = new int[n + 1];
        return fibonacciHelper_TAB(n, arr);
    }
    private int fibonacciHelper_TAB(int n, int[] arr) {
        if (n < 1)
            return 0;
        if (n == 1)
            return 1;
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
    public int fibonacci_MEMO(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return fibonacciHelper_MEMO(n, arr);
    }
    private int fibonacciHelper_MEMO(int n, int[] arr) {
        if (n < 0)
            return 0;
        if (n == 1)
            return 1;
        if (arr[n] != -1)
            return arr[n];
        return (arr[n] = (fibonacciHelper_MEMO(n-1, arr) + fibonacciHelper_MEMO(n-2, arr)));
    }

    public int factorial_TAB(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        return factorialHelper_TAB(n, arr);

    }
    private int factorialHelper_TAB(int n, int[] arr) {
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] * i;
        }
        return arr[n];
    }
    public int factorial_MEMO(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        return factorialHelper_MEMO(n, arr);

    }
    private int factorialHelper_MEMO(int n, int[] arr) {
        if (n == 0)
            return 1;
        if (arr[n] != -1)
            return arr[n];
        return (arr[n] = n * factorialHelper_MEMO(n - 1, arr));
    }
    /*
        We are given two strings: string S of length n, and string T of length m. Our goal is to produce their
        longest common subsequence: the longest sequence of characters that appear left-to-right (but not
        necessarily in a contiguous block) in both strings.
     */

}
