import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    public void test(){
        RevString revString = new RevString();
        String result = revString.reverseString("toufique");
        assertEquals("euqifuot", result);
    }
}
