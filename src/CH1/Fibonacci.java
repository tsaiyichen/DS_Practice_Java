package CH1;

class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci numbers 10: " + fibonacci_recursive(10));
        System.out.println("Fibonacci numbers 15: " + fibonacci_iteration(15));
    }
    public static int fibonacci_recursive(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
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
}
