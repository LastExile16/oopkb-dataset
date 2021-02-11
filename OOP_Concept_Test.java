class Circle {
   
   private double radius;
   public double pi = Math.PI;
   
   public Circle() {
      this.radius = 1.0;
   }
   public Circle(double r) {
      this.radius = radius;
   }

   
   public double getRadius() {
      return this.radius;
   }
   public void setRadius(double r) {
      this.radius = radius;
   }
   

   /** Returns a self-descriptive String */
   public String toString() {
      return "Circle[radius=" + radius + "]";
   }

   /** Returns the area of this Circle */
   public double area() {
      return radius * radius * Math.PI;
   }
}

/**
 * A Cylinder is a Circle plus a height.
 */
class Cylinder extends Circle
{
   
   private double height;

   
   public Cylinder() {
      super();  
      this.height = 1.0;
   }
/*   public Cylinder(double h) {
      super();  
      this.height = h;
   }*/
   public Cylinder(double h, double r) {
      super(r);  
      this.height = h;
   }
   

   
   public double getHeight() {
      return this.height;
   }
   public void setSize(double h) {
      this.height = h;
   }
   public void setSize(double h, double r) {
      super.setRadius(r);
      this.height = h;
   }

   
   public double volume() {
      return super.area()*height;   
   }
   
   
   public double area() {
      return 2*Math.PI*getRadius()*height + 2*super.area();
   }
   
   public String toString() {
      return "Cylinder[" + super.toString() + ",height=" + height + "]";   
   }
}

//MAIN////////////////
public class OOP_Concept_Test {
   public static void main(String[] args) {
      Cylinder cy1 = new Cylinder();
      
      System.out.println("Radius is " + cy1.getRadius()
         + ", Height is " + cy1.getHeight()
         + ", Volume is " + cy1.volume());
   
      Cylinder cy2 = new Cylinder(5.0, 2.0); 
      System.out.println("Radius is " + cy2.getRadius()
         + ", Height is " + cy2.getHeight()
         + ", Volume is " + cy2.volume());
      cy2 = cy1;
      cy2.setSize(34);
      Circle circ = cy2;

   }
}
