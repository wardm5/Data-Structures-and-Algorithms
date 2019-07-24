import java.util.*;

/*
    This file is focused on solving Dynamic Programming questions for interview situations and fun practice :D
    Note:   methods will have the problem, underscore, and either TAB or MEMO denoting what type of dynamic programming
            strategy I used for the method.
 */

public class DynamicProgramming {
    public DynamicProgramming() {}
    public int fibonacci_TAB(int n) {
        int[] arr = new int[n + 1];   // Tabulation, set a new array of n+1 items, initalization to 0 is okay
        return fibonacciHelper_TAB(n, arr);  // return the number and also the array
    }
    private int fibonacciHelper_TAB(int n, int[] arr) {  // helper function that will hold the array
        if (n < 1)   // if n is less than 1, then return 0
            return 0;
        if (n == 1)  // if n is 1, then return 1
            return 1;
        arr[0] = 0;  // other wise, set the first value in the as 0 (fib(0) = 0)
        arr[1] = 1;  // set the second value in the as 1 (fib(1) = 1)
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];   // set each value after the second as the addition of both the two before
                                                // arr[2] = arr[1] + arr[0] which is 1 + 0, so arr[2] will hold 1
                                                // arr[3] = arr[2] + arr[1] which is 1 + 1, so arr[3] will hold 2
                                                // arr[4] = arr[3] + arr[2] which is 2 + 1, so arr[4] will hold 3
                                                // arr[5] = arr[4] + arr[3] which is 3 + 2, so arr[5] will hold 5
                                                // this continues... eventually, you will return arr[n] which will hold the
                                                // fib value for that index.
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
    public int getNthUglyNumber_TAB(int n) {
        int ugly[] = new int[n];  // To store ugly numbers
        int i2 = 0, i3 = 0, i5 = 0;
        int mult_of_2 = 2;
        int mult_of_3 = 3;
        int mult_of_5 = 5;
        int next_ugly_no = 1;
        ugly[0] = 1;
        for(int i = 1; i < n; i++) {
            next_ugly_no = Math.min(mult_of_2, Math.min(mult_of_3, mult_of_5));
            ugly[i] = next_ugly_no;
            if (next_ugly_no == mult_of_2) {
                i2 = i2+1;
                mult_of_2 = ugly[i2]*2;
            }
            if (next_ugly_no == mult_of_3) {
                i3 = i3+1;
                mult_of_3 = ugly[i3]*3;
            }
            if (next_ugly_no == mult_of_5) {
                i5 = i5+1;
                mult_of_5 = ugly[i5]*5;
            }
         } /*End of for loop (i=1; i<n; i++) */
         return next_ugly_no;
    }
    public count


    /*
        We are given two strings: string S of length n, and string T of length m. Our goal is to produce their
        longest common subsequence: the longest sequence of characters that appear left-to-right (but not
        necessarily in a contiguous block) in both strings.
     */

}
