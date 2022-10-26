public class RecursiveApp{
   public static int numOccurrences(char letter, String source, int index){
      
      if (index == source.length()){
      return 0;
      }
      else if (Character.toLowerCase(source.charAt(index)) == letter){
      return 1 + numOccurrences(letter, source, index + 1);
      }
      
      else {
         return 0 + numOccurrences(letter, source, index + 1);
      }
      }
   
   public static void main(String[] args){
     System.out.println(numOccurrences('p', "hippopotomonstrosesquippedaliophobia", 0));
     System.out.println(numOccurrences('r', "refrigerator", 0));
     System.out.println(numOccurrences('n', "entertainment", 0));
     System.out.println(numOccurrences('o', "entertainment", 0));
     System.out.println(numOccurrences('l', "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", 0));
   }
}