import java.util.Scanner;
// import java.util.InputMismatchException;

public class PasswordException{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      boolean repeat = true;
      while(repeat){
      System.out.print("Input a password between 8 and 15 characters in length: ");
      try{
         String pass = in.nextLine();
         System.out.println("You entered " + pass);
         if(pass.length() < 8 || pass.length() > 15){
            throw new Exception();
         }
         else
            System.out.print("That is a valid password.");
            repeat = false;
      }
      catch(Exception e){
         System.out.println("Password doesn't meet requirements. Try again.");          
      }
      }
   }
}      