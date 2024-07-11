package CH1;

public class gcd {
    public static int calling = 0;
    public static void main(String[] args) {
        System.out.println("GCD(26,33): " + gcd_recursive(26, 33));
        System.out.printf("function call: %d times\n", calling);
        System.out.println("GCD(44, 77): " + gcd_iterative(44, 77));
    }

    public static int gcd_recursive(int a, int b) {
        calling++;
        if(a % b == 0){
            return b;
        }
        else{
            return gcd_recursive(b, a % b);
        }
    }

    public static int gcd_iterative(int a, int b) {
        int ans = 1;
        for(int i = Math.min(a, b); i > 1; i--){
            if(a % i == 0 && b % i == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
