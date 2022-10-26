public class Student extends Person implements Comparable<Student>{
   private String classification, major;
   private double gpa;
   
   private static int idHelper = 1000;
   private String stuId;
   
   public Student(String major, double gpa, String classification, String name, String gender, String phone, int age){
      super(name, gender, phone, age);
      this.major = major;
      this.gpa = gpa;
      this.classification = classification;
      
      // give student their own id#
      stuId = Integer.toString(idHelper);
      // increment id # for next student
      idHelper ++;
      }
      
   @Override
   public String toString(){
      return super.toString() + " I study " + classification + " for " + major + ". My student ID is " + stuId + ".";
      }
   
   @Override
   public int compareTo(Student that){
      if (this.gpa < that.gpa)
         return -1;
      else if (this.gpa > that.gpa)
         return 1;
      else
         return 0;
   }
}
     