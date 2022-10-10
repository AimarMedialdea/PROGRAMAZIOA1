import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {  // Program entry point

        double radius;

        Scanner in = new Scanner(System.in);             //input

        System.out.println("Enter first integer: ");
        radius = in.nextInt();

        in.close();

        double diameter = 2.0 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2.0 * Math.PI * radius;

        System.out.printf("Diameter: %.2f\n",diameter);
        System.out.printf("Area: %.2f\n",area);
        System.out.printf("Circumference %.2f\n",circumference);
     }
    }