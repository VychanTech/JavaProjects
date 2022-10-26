public class PersonDriver{
   public static void main(String[] args){
      //Creates 3 people and prints their names and age
      Person p1 = new Person("Dakota", "Male");
      System.out.println("My Person's name is " + p1.getName() + " who's gender is " + p1.getGender());
      Person p2 = new Person("Lydia", "Female");
      System.out.println("My Person's name is " + p2.getName() + " who's gender is " + p2.getGender());
      System.out.println("Are Person 1 and Person 2 equal?: " + (p1 == p2));
      Person p3 = new Person("Ellie", "Female");
      
      //Creates 4th Person that is a copy of Person 1
      Person p4 = new Person(p1);
      System.out.println(p1.getName() + " " + p1.getGender());
      System.out.println(p2.getName() + " " + p2.getGender());
      System.out.println(p3.getName() + " " + p3.getGender());
      System.out.println(p4.getName() + " " + p4.getGender());
      
      //Checks to see if Person 4 and Person 1 are equal
      System.out.println("Are Person 1 and Person 4 equal?: " + (p1 == p4));
      }
}