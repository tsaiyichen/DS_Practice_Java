package CH1;

public class binomialCoefficient {
    public static int calling = 0;
    public static void main(String[] args) {
        System.out.println("Bin(7, 3): " + Bin_iteration(7, 3));
        System.out.println("Bin(5, 3): " + Bin_recursive(5, 3));
        System.out.println("calling times: " + calling);
        System.out.println("Bin(5, 3): " + Bin_dynamic(5, 3)[5][3]);
    }

    public static int Bin_iteration(int n, int m){
        m = Math.min(m, n);
        int a = 1, b = 1;
        for(int i = 0; i < m; i++){
            a *= n;
            b *= (i+1);
            n--;
        }
        return a / b;
    }
    public static int Bin_recursive(int n, int m){
        calling++;
        if(m == 0 || n == m){
            return 1;
        }else{
            return Bin_recursive(n-1, m) + Bin_recursive(n - 1, m-1);
        }
    }
    public static int[][] Bin_dynamic(int n, int k){
        int[][] array = new int[n + 1][k + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= Math.min(i, k); j++){
                if(i == j || j == 0){
                    array[i][j] = 1;
                }else{
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        return array;
    }
}
