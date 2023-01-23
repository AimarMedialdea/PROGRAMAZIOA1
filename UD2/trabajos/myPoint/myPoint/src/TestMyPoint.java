import java.util.Random;

public class TestMyPoint {
public static void main(String[] args) {
/*     MyPoint p0 = new MyPoint();
    MyPoint p1 = new MyPoint(2,1);
    MyPoint p2 = new MyPoint(4,0);
    
    System.out.println("p0 => " + p0);
    System.out.println("p1 => " + p1);
    System.out.println("p2 => " + p2);

    System.out.println();
    System.out.println("Distantziak koordenatu-jatorriarekiko:");
    System.out.println("p0 => " + p0.distance());
    System.out.println("p1 => " + p1.distance());
    System.out.println("p2 => " + p2.distance());

    System.out.println();
    System.out.println("Distantziak euren artean:");
    System.out.println("p0tik p1ra => " + p0.distance(p1));
    System.out.println("p0tik p2ra => " + p0.distance(p2));
    System.out.println("p1tik p2ra => " + p1.distance(p2)); */

    int[] punto = new int[10];
    for(int i = 0; i < 10; i++){
        punto[i] = i;
        punto[i] ++;
        System.out.print("(" + punto[i] + ", " + punto[i] + "), ");
        
    } 

    System.out.println();
    Random random = new Random();
    int number = random.nextInt(0, 9);

    int[] punto1 = new int[5];
    for(int i = 0; i < 10; i++){
        punto1[i] = number;
        punto1[i] ++;
        System.out.print("(" + punto1[i] + ", " + number + "), ");
        
    } 

}
                      
}
