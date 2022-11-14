import java.util.Scanner;

/**
 * A Test Driver for the "Circle" class
 */
public class TestCircle { 
    public static void main(String[] args) { 
       
        System.out.println("Sartu radio berria");
        Scanner in = new Scanner(System.in);

        double newRadius = in.nextInt();
    
        in.close();

        System.out.println("Zirkulua   Erradioa    Kolorea    Azalera");
        System.out.println("==========================================");

        
        Circle c1 = new Circle(2.0, "green");
        c1.setRadius(newRadius);
        System.out.println("   c1        " + c1.getRadius() + "      " + c1.getColor() + "       " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("   c2        " + c2.getRadius() + "       " + c2.getColor() + "       " + c2.getArea()); 

       
        Circle c3 = new Circle();
        System.out.println("   c3        " + c3.getRadius() + "       " + c3.getColor() + "       " + c3.getArea()); 

        Circle c4 = new Circle(50,"blue");
        System.out.println("   c4        " + c4.getRadius() + "       " + c4.getColor() + "       " + c4.getArea()); 

        System.out.println("Azken zirkulua: " + c4);
    }
}
