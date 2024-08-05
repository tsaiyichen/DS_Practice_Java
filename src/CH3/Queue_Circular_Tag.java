package CH3;

public class Queue_Circular_Tag {
    private int [] array;
    private int rear = 0;
    private int front = 0;
    private boolean tag = false;
    public Queue_Circular_Tag(int n) {
        this.array = new int[n];
    }

    public void enQueue(int x) {
        if(rear == front && tag){
            System.out.println("Queue is full");
        }else{
            rear = (rear + 1) % array.length;
            /****/
            if(rear == front){
                tag = true;
            }
            /****/
            array[rear] = x;
        }
    }

    public int deQueue() {
        if(front == rear && !tag){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }else{
            front = (front + 1) % array.length;
            /****/
            if(front == rear){
                tag = false;
            }
            /****/
            return array[front];
        }
    }
}
