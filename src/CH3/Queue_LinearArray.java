package CH3;

public class Queue_LinearArray {
    private int [] array;
    private int rear = -1, front = -1;
    public Queue_LinearArray(int n) {
        this.array = new int[n];
    }

    public void enQueue(int x){
        if(rear == array.length - 1){
            if(front == -1){
                System.out.println("Queue Linear is full");
                return;
            }
            else{
                for(int i = front + 1; i < array.length; i++){
                    array[i - (front + 1)] = array[i];
                }
                rear -= (front + 1);
                front -= (front + 1);
            }
        }
        rear++;
        array[rear] = x;
    }
    public int deQueue(){
        if(front == rear){
            System.out.println("Queue Linear is empty");
            return Integer.MIN_VALUE;
        }else{
            front++;
            return array[front];
        }
    }
}
