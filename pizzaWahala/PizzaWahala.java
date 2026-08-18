import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testToOrderPizzaFromIyaHonourPizzaJointSabo() {
        Order order = new Order();
        int numberOfBoxes = order.subtract(45, 10);
        int expected = 35;
        assertEquals(expected, numberOfBoxes);
    }
}
