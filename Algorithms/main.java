public class main {
    private static DynamicProgramming dp = new DynamicProgramming();
    public static void main(String[] args) {
        fib("fibonacci_TAB");
        fact("factorial_TAB");
    }
    private static void print(String str) {
        System.out.println();
        System.out.println(str);
    }
    private static void fib(String str) {
        print(str.toUpperCase() + " TESTS");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + dp.fibonacci_TAB(i));
        }
    }
    private static void fact(String str) {
        print(str.toUpperCase() + " TESTS");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + dp.factorial_TAB(i));
        }
    }

}
