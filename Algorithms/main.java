public class main {
    public static void main(String[] args) {
        DynamicProgramming dp = new DynamicProgramming();
        System.out.println(dp.fib(10));
        for(int i = 0; i < 10; i++) {
            System.out.println(dp.factorial(i));
        }
    }
}
