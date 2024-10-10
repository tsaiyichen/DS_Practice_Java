package CH5;

public class heapMain {
    public static void main(String[] args) {
        int arr1[] = new int []{2, 5, 7, 3, 8, 6, 9, 10};
        Max_Heap heap1 = new Max_Heap(arr1, 't');
        heap1.printHeap();
        System.out.printf("heap1 size: %d\n", heap1.getSize());
        Max_Heap heap2 = new Max_Heap(arr1, 'b');
        heap2.printHeap();
        System.out.printf("heap2 size: %d\n", heap2.getSize());
        System.out.println("heap2: deleteMax: " + heap2.deleteMax());
        heap2.printHeap();
        System.out.printf("heap2 size: %d\n", heap2.getSize());

        int arr2[] = new int[]{12, 1, 4, 11, 15, 20};
        Max_Heap heap3 = new Max_Heap(arr2, 'b');
        heap3.printHeap();
        System.out.printf("heap3 size: %d\n", heap3.getSize());

        heap1.mergeTwoHeap(heap3);
        heap1.printHeap();
        System.out.printf("heap1 size: %d\n", heap1.getSize());
    }
}
