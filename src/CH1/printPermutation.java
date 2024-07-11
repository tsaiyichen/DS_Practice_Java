package CH1;

public class printPermutation {
    public static int execute = 0;
    public static void main(String[] args) {

        char arr[] = new char[]{'a', 'b', 'c', 'd', 'e'};
        p(arr, 0, 2);
        System.out.printf("total execute: %d times.", execute);
    }

    public static void p(char[] list, int start, int end) {
        //all permutation from list[start] to list[end];
        if(start == end) {
            for(int i = 0; i <= end; i++) {
                execute++;
                System.out.print(list[i]);
            }
            System.out.println();
        }
        else{
            for(int i = start; i <= end; i++) {
                char temp = list[start];
                list[start] = list[i];
                list[i] = temp;

                p(list, start + 1, end);

                char temp2 = list[start];
                list[start] = list[i];
                list[i] = temp2;

            }
        }
    }
}
