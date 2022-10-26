public class Rhombus extends Shape{
   private double p, q;
   
   public Rhombus(String color, double p, double q){
      super(color);
      this.p = p;
      this.q = q;
      
   }
   
   public double getArea(){
      return ((p*q)/2);
   }
   
   @Override
   public String toString(){
      return "This Rhombus is colored " + super.toString();
   }
}