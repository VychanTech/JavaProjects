public class Student extends Person{
   private String classification, major;
   private static int studentId = 0;
   
   public Student(String classification, String major, String name, String gender, String phone, int age){
      super(name, gender, phone, age);
      this.classification = classification;
      this.major = major;
      studentId += 1;
      }
      
   @Override
   public String toString(){
      return super.toString() + " I study " + classification + " for " + major + ". My student ID is " + studentId + ".";
      }
}
     