import java.util.*;
public class main {
    private static DynamicProgramming dp = new DynamicProgramming();
    public static void main(String[] args) {
        //    NOTE: 0 = TAB, 1 = MEMO
        fib("fibonacci_TAB");
        fact("factorial_TAB");
        uglyNum("Ugly Numbers_TAB");
        permutation("Permutation");

    }
    private static void print(String str) {
        System.out.println(str);
    }
    private static void newLine(){
        System.out.println();
    }
    private static void fib(String str) {
        newLine();
        print("******** " + str.toUpperCase() + " TESTS ********");
        print("Tabulation");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + dp.fibonacci_TAB(i));
        }
        print("Memoization");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + dp.fibonacci_MEMO(i));
        }
    }
    private static void fact(String str) {
        newLine();
        print("******** " + str.toUpperCase() + " TESTS ********");
        print("Tabulation");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + dp.factorial_TAB(i));
        }
        print("Memoization");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + dp.factorial_MEMO(i));
        }
    }
    private static void uglyNum(String str) {
        newLine();
        print("******** " + str.toUpperCase() + " TESTS ********");
        print("Tabulation");
        for(int i = 1; i <= 15; i++) {
            System.out.println(i + "  " + dp.getNthUglyNumber_TAB(i));
        }
    }
    private static void permutation(String str) {
        newLine();
        print("******** " + str.toUpperCase() + " TESTS ********");
        String test = "abc";
        List<String> res = dp.perm(test);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }


}
