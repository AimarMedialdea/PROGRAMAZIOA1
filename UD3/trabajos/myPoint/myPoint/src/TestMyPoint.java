import java.util.Random;

public class TestMyPoint {
public static void main(String[] args) {
    MyPoint p0 = new MyPoint();
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
    System.out.println("p1tik p2ra => " + p1.distance(p2));

    System.out.println();

    int[] punto0 = new int[10];
    for(int i = 0; i < punto0.length; i++){
        punto0[i] = i;
        punto0[i] ++;
        if(punto0[i] == punto0.length){
            System.out.print("(" + punto0[i] + ", " + punto0[i] + ")");
        }else{
            System.out.print("(" + punto0[i] + ", " + punto0[i] + "), ");
        }
         
    } 

    System.out.println();
    System.out.println();
    Random random = new Random();
    
    int[] punto1 = new int[5];
    for(int i = 0; i < punto1.length; i++){
        int number = random.nextInt(0, 9);
        punto1[i] = number;
        punto1[i] ++;
        if(punto1[i] == punto1.length){
            System.out.print("(" + punto1[i] + ", " + number + ")");
        }else{
            System.out.print("(" + punto1[i] + ", " + number + "), ");
        }
        
        
    } 

    
}
                      
}
