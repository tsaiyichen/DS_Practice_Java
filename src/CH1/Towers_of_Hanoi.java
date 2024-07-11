package CH1;

public class Towers_of_Hanoi {
    public static int moving = 0;
    public static void main(String[] args) {
        Hanoi(5,'A', 'C', 'B');
        System.out.println("minimum moving: " + moving + " times.");
    }
    public static void Hanoi(int n, char from, char to, char aux){

        if(n == 1){
            moving++;
            System.out.printf("move disk 1 from %c to %c\n", from, to);
        }else{
            Hanoi(n-1, from, aux, to);
            moving++;
            System.out.printf("move disk %d from %c to %c\n", n, from, to);
            Hanoi(n-1, aux, to, from);
        }
    }
}
