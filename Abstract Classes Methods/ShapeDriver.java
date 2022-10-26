public class ShapeDriver{
   public static void main(String[] args){
      Trapezoid t1 = new Trapezoid("Green", 5, 10, 3);
      System.out.println(t1 + " and it's area is " + t1.getArea());
      Rhombus r1 = new Rhombus("Yellow", 12, 6);
      System.out.println(r1 + " and it's area is " + r1.getArea());
   }
}