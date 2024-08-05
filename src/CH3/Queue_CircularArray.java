package CH3;

public class Queue_CircularArray {
    private int [] array;
    private int rear = 0;
    private int front = 0;
    public Queue_CircularArray(int n) {
        this.array = new int[n];
    }

    public void enQueue(int x){
        rear = (rear + 1) % array.length;
        if(rear == front){
            System.out.println("Queue Circular is full");
            rear = (rear - 1) % array.length;
        }else{
            array[rear] = x;
        }
    }

    public int deQueue(){
        if(front == rear){
            System.out.println("Queue Circular is empty");
            return Integer.MIN_VALUE;
        }else{
            front = (front + 1) % array.length;
            return array[front];
        }
    }
}
