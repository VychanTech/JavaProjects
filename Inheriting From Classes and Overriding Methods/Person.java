/**
  * Creates a {@code Person} with name, age, gender and phone number.
  *
  * Author Dakota Vaughn
*/

public class Person{
   //attributes
   private String name, gender, phone;
   private int age;
   
   //getters & setters
   public String getName(){
      return name;
      }
   public void setName(String name){
      this.name = name;
      }
   public String getGender(){
      return gender;
      }
   public void setGender(String gender){
      this.gender = gender;
      }
   public String getPhone(){
      return phone;
      }
   public void setPhone(String phone){
      this.phone = phone;
      }
   public int getAge(){
      return age;
      }
   public void setAge(int age){
      this.age = age;
      }

   public void haveBirthday(){
   setAge(this.age + 1);
   }
   
   //Simulates baby being born with only name and gender
   public Person(String name, String gender){
      this.name = name;
      this.gender = gender;
      }
   
   //Simulates creating an adult
   public Person(String name, String gender, String phone, int age){
      this.name = name;
      this.gender = gender;
      this.phone = phone;
      this.age = age;
}

   public String toString(){
      return "My name is " + name + ". I am a " + age + " year old " + gender + ". You can reach me at " + phone + "!";
      }
      
   public boolean equals(Person that){
   if(this.name == that.name && this.gender == that.gender){
      return true;
   }
   else{
      return false;
}
}

   public Person(Person that){
      this.name = that.name;
      this.gender = that.gender;
}
}