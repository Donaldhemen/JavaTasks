import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testToOrderPizzaFromIyaHonourPizzaJointSabo() {
        Order order = new Order();
        int numberOfBoxes = order.howManyBoxes(45, 12);
        int expected = 4;
        assertEquals(expected, numberOfBoxes);
    }

    @Test
    public void testToCheckRemainingSlicesAfterEveryoneGetsAPiece() {
        Order order = new Order();
        int remainingSlices = order.howManySlicesLeft(45, 12);
        int expected = 3;
        assertEquals(expected, remainingSlices);
    }

    @Test
    public void testToCheckThePriceOfBoxesOfPizzaOrdered() {
        Order order = new Order();
        int payment = order.howMuchPayment(45, 12);
        int expected = 20800;
        assertEquals(expected, payment);
    }
}
