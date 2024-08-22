package CH5;

public class Max_Heap {
    private int[] heap;
    private int size;

    public int getSize(){
        return this.size;
    }
    public void setSize(int i){
        this.size = i;
    }
    public void printHeap(){
        System.out.print("Heap: ");
        for(int i = 0; i <= size; i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public void insert(int x){
        heap[++size] = x;
        int child = size;
        int parent = (size - 1) / 2;

        while(parent >= 0){
            if(heap[parent] < x){
                heap[child] = heap[parent];
                child = parent;
                if(child == 0){
                    parent = -1;
                }else{
                    parent = (parent - 1) / 2;
                }
            }else{
                break;
            }
        }
        //System.out.printf("input %d into heap\n", x);
        heap[child] = x;
    }
    public void adjust(int node){
        int x = heap[node];
        int child = 2 * node + 1;
        while(child <= size){
            if(child < size && heap[child] < heap[child + 1]){
                child++;
            }

            if(x < heap[child]){
                heap[(child - 1) / 2] = heap[child];
                child = child * 2 + 1;
            }else{
                break;
            }
        }
        heap[(child - 1) / 2] = x;
    }

    public Max_Heap(int[] arr, char method){

        this.heap = new int[1000];
        this.size = -1;

        if(method == 't'){
            for(int i = 0; i < arr.length; i++){
                insert(arr[i]);
            }
        }else if(method == 'b'){
            for(int i = 0; i < arr.length; i++){
                heap[++size] = arr[i];
            }
            int maxParent = (size - 1) / 2;
            for(int i = maxParent; i >= 0; i--){
                adjust(i);
            }
        }else{
            System.out.println("error");
        }
    }

    public int deleteMax(){
        int x = heap[0];
        heap[0] = heap[size--];
        adjust(0);
        return x;
    }
    public int findMax(){
        return heap[0];
    }

    public void mergeTwoHeap(Max_Heap h){
        for(int i = 0; i <= h.getSize(); i++){
            this.heap[++size] = h.heap[i];
        }

        int maxParent = (size - 1) / 2;

        for(int i = maxParent; i >= 0; i--){
            adjust(i);
        }
    }
}
