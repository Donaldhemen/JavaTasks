import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderTest {
    @Test
    public void testToHelpCalculateTheRidersWageForTheDay() {
        BackToSender back = new BackToSender();
        int ridersDailyWage = back.calculateDailyPay(80);
        int expected = 45000;
        assertEquals(expected, ridersDailyWage);
    }
}
