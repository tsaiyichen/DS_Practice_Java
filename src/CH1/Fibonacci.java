package CH1;

class Fibonacci {

    public static int functionCallTime = 0;
    public static int[] callingTime = new int[11];
    public static int addTime = 0;

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers 10: " + fibonacci_recursive(10));
        System.out.println("total function call times: " + functionCallTime);
        System.out.println("total addtion times: " + addTime);
        for(int i = 0; i < 11; i++){
            System.out.printf("function call times of F(%d): %d\n", i, callingTime[i]);
        }
        System.out.println("Fibonacci numbers 15: " + fibonacci_iteration(15));
        System.out.println("use dynamic programming: Fib(10): " + dynamicFib(10)[10]);
    }

    public static int fibonacci_recursive(int n) {
        functionCallTime++;
        callingTime[n]++;
        if(n == 0) {
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            addTime++;
            return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
        }
    }

    public static int fibonacci_iteration(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int[] dynamicFib(int n){
        int [] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i <= n; i++){
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}
