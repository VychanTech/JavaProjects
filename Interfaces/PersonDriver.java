public class PersonDriver{
   public static void main(String[] args){
      // //Creates 3 people and prints their names and age
//       Person p1 = new Person("Dakota", "Male", "770-555-1234", 27); 
//       System.out.println(p1);
//       Person p2 = new Person("Lydia", "Female", "770-555-4321", 24);
//       System.out.println(p2);
//       System.out.println("Are Person 1 and Person 2 equal?: " + (p1 == p2));
//       Person p3 = new Person("Ellie", "Female");
//       
//       //Creates 4th Person that is a copy of Person 1
//       Person p4 = new Person(p1);
//       System.out.println(p1.getName() + " " + p1.getGender());
//       System.out.println(p2.getName() + " " + p2.getGender());
//       System.out.println(p3.getName() + " " + p3.getGender());
//       System.out.println(p4.getName() + " " + p4.getGender());
//       
//       //Checks to see if Person 4 and Person 1 are equal
//       System.out.println("Are Person 1 and Person 4 equal?: " + (p1.equals(p4)));
      
      //Tests Student Constructor
      Student s1 = new Student("CSC1", 4.0, "IT", "Dakota", "Male", "123456", 27);
      System.out.println(s1);
      
      Student s2 = new Student("Calculus", 3.5, "Math", "Lydia", "Female", "789123", 24);
      System.out.println(s2);
      
      System.out.println(s1.compareTo(s2));
      }
      }
      
     
      
