package CH3;

public class MyStack {
    private int top;
    private int[] stack;

    public void cleanStack(){
         top = -1;
    }
    public MyStack(int n) {
        top = -1;
        stack = new int[n];
    }
    public boolean isFull(){
        if(top == stack.length - 1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }else{
            //System.out.printf("push %d into stack\n", x);
            stack[++top] = x;
            return true;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else{
            return stack[top--];
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[top];
        }
    }
}
