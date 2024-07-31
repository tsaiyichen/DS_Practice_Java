package CH3;

public class SharedStack {
    protected int [] array;
    protected int top1;
    protected int top2;

    public SharedStack(int n) {
        array = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push(int stack, int x) {
        if(stack == 1){
            if(top1 < top2 - 1){
                array[++top1] = x;
                System.out.printf("push %d into Stack%d\n", x, stack);
            }else{
                System.out.println("Stack1 Overflow");
            }
        }else{
            if(top2 > top1 + 1){
                array[--top2] = x;
                System.out.printf("push %d into Stack%d\n", x, stack);
            }else{
                System.out.println("Stack2 Overflow");
            }
        }
    }

    public int pop(int stack){
        if(stack == 1){
            if(top1 >= 0){
                return array[top1--];
            }
            else{
                System.out.println("Stack1 is Empty");
                return Integer.MIN_VALUE;
            }
        }else{
            if(top2 < array.length){
                return array[top2--];
            }else{
                System.out.println("Stack2 is Empty");
                return Integer.MIN_VALUE;
            }
        }
    }
}
