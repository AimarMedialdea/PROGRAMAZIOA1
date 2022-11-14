/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {    
   
   private double radius;
   private String color;
   private double area;

   public Circle() {                   // 1st Constructor (default constructor)
      radius = 1.0;
      color = "red";
   }
   /** Constructs a Circle instance with the given radius and default color*/
   public Circle(double r) {           // 2nd Constructor
      radius = r;
      color = "red";
   }
   /** Constructs a Circle instance with the given radius and color */
   public Circle(double r, String c) { // 3rd Constructor
      radius = r;
      color = c;
   }

   public Circle(double r, String c, double a){
    radius = r;
    color = c;
    area = a;
   }

   // Public methods
   /** Returns the radius */
   public double getRadius() {  // getter for radius
      return radius;
   }

   public void setRadius(double newRadius) {
      radius = newRadius;
   }

   /** Returns the color */
   public String getColor() {   // getter for color
      return color;
   }

   public void setColor(String newColor) {
      color = newColor;
   }

   /** Returns the area of this circle */
   public double getArea() {
      area = radius * radius * Math.PI;
      return area;
   }
   // Return a String description of this instance
    public String toString() {
    return "Circle[radius=" + radius + ",color=" + color + "]";
 }
}