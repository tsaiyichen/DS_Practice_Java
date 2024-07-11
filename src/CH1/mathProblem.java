package CH1;

public class mathProblem {
    public static int a_calling, sum_calling, exp_calling_N, exp_calling_logN;
    public static void main(String[] args) {
        System.out.printf("A(2,2): %d, A(2, 1): %d, A(1,2): %d, A(2,3): %d, function call: %d times.\n",
                ackermann(2, 2), ackermann(2, 1), ackermann(1, 2), ackermann(2, 3), a_calling);
        System.out.printf("SUM(5): %d, function call: %d times\n", sum(5), sum_calling);
        System.out.printf("EXP(2, 5): %d, function call: %d times\n", exp_n(2, 5), exp_calling_N);
        System.out.printf("EXP(2, 5): %d, function call: %d times\n", exp_logn(2, 5), exp_calling_logN);

    }

    public static int ackermann(int m, int n) {
        a_calling++;
        if (m == 0) {
            return n + 1;
        }
        else if (n == 0) {
            return ackermann(m - 1, 1);
        }else{
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
    public static int sum(int n){
        sum_calling++;
        if (n == 0){
            return 0;
        }else{
            return sum(n-1) + n;
        }
    }
    public static int exp_n(int x, int n){
        exp_calling_N++;
        if (n == 0){
            return 1;
        }else{
            return exp_n(x,n-1) * x;
        }
    }
    public static int exp_logn(int x, int n){
        exp_calling_logN++;
        if(n == 1) return x;
        int f = -1;
        switch (n % 2) {
            case 0:
                f = 1;
                break;
            default:
                f = x;
        }
        return exp_logn(x * x, n / 2) * f;
    }
}
