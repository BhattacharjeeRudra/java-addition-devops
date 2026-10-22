import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    public void testAddition() {
        assertEquals(5, Addition.add(2, 3));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-5, Addition.add(-2, -3));
    }

    @Test
    public void testZero() {
        assertEquals(7, Addition.add(7, 0));
    }
}
