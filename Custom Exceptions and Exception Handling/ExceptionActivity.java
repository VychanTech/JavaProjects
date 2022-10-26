public class ExceptionActivity{
    public static void main(String[] args){
        // get password from user
        // don't worry about catching exceptions with the input
        // that's not the point here
        try{
            // this is the part where you check for your exception
            // you can do your check and throw your exception here
            // or you can do it in a separate method, see below
        }catch(){
            // which exception is caught
            // simply print your detail message here
        }
    }
    
    // you can do this if you like, but not necessary
    public static boolean isValidPassword(String password){
        // you can write a separate method to check whether the given
        // password is valid
        // if it is not valid, throw your exception
        // if it is valid, return true
        // don't forget to inform the compiler the method will
        // throw an exception
    }
}