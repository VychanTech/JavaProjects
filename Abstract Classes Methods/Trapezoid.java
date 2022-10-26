public class Trapezoid extends Shape{
   private double a, b, h;
   
   public Trapezoid(String color, double a, double b, double h){
      super(color);
      this.a = a;
      this.b = b;
      this.h = h;
      
   }
   
   public double getArea(){
      return (((a + b)/2) * h);
   }
   
   @Override
   public String toString(){
      return "This Trapezoid is colored " + super.toString();
   }
}