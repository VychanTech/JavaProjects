import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

public class RecursionAppTest{
    
    @Test
    public void testClassic(){
        int count = RecursionApp.numOccurrences('p',"hippopotomonstrosesquippedaliophobia",0);
        assertEquals(6, count);
   }
    
    @Test
    public void testZero(){
        int count = RecursionApp.numOccurrences('a',"podium",0);
        assertEquals(0, count);
    }
    
    @Test
    public void testCaseSensitivity(){
        int count = RecursionApp.numOccurrences('l', "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", 0);
        assertEquals(11, count);
    }
}
