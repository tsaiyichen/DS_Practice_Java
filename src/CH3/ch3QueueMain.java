package CH3;

public class ch3QueueMain {
    public static void main(String[] args) {
        Queue_LinearArray QL = new Queue_LinearArray(5);
        QL.enQueue(1); //1
        QL.enQueue(2); //12
        QL.enQueue(3); //123
        System.out.println(QL.deQueue()); //23
        QL.enQueue(4); //234
        QL.enQueue(5); //2345
        QL.enQueue(6); //23456
        QL.enQueue(7); // FULL
        System.out.println(QL.deQueue()); //3456
        QL.enQueue(7); //34567

        Queue_CircularArray QC = new Queue_CircularArray(5);
        QC.enQueue(1); //1
        QC.enQueue(2); //12
        QC.enQueue(3); //123
        System.out.println(QC.deQueue()); //23
        QC.enQueue(4); //234
        QC.enQueue(5); //2345
        QC.enQueue(6); //FULL!!! because only n - 1 space
        QC.enQueue(7); //FULL
        System.out.println(QC.deQueue()); //345
        QC.enQueue(7); //3457

        Queue_Circular_Tag QCT = new Queue_Circular_Tag(5);
        QCT.enQueue(1); //1
        QCT.enQueue(2); //12
        QCT.enQueue(3); //123
        System.out.println(QCT.deQueue()); //23
        QCT.enQueue(4); //234
        QCT.enQueue(5); //2345
        QCT.enQueue(6); //23456
        QCT.enQueue(7); //FULL
        System.out.println(QCT.deQueue()); //3456
        QCT.enQueue(7); //34567
    }
}
