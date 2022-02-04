import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSubtract() {
        assertEquals(2, SkillDemo.subtract(3,1));
    }
}