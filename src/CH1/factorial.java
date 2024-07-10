package CH1;

public class factorial {
    public static void main(String[] args) {
        System.out.println("5!: " + fac_recursive(5));
        System.out.println("4!: " + fac_iteration(4));
    }

    public static int fac_recursive(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * fac_recursive(n-1);
        }
    }
    public static int fac_iteration(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= i;
        }
        return ans;
    }
}
