public class CylinderComputation {
    
    public static void main(String[] args) {
       double radius, height, surfaceArea, baseArea, volume;
       final double PI = 3.14159265;


       height = 2;
       radius = 3;

      baseArea = PI * radius * 2;
      surfaceArea = 2 * PI * radius + 2.0 * baseArea;
      volume = baseArea * height;
     
        System.out.print("The surface area is:" );  
        System.out.println(surfaceArea);        
        System.out.print("the base area is: ");
        System.out.println(baseArea);
        System.out.print("the volume is: ");
        System.out.println(volume);
     }
  }