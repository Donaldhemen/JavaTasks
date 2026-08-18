import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekendDoseTest {

    @Test
    public void testToSumAllNumbersFromOneToNUsingALoop(){
    
    int number = 5;
    
    int expectedSum = WeekendDose.calculateSumToN(number);
    int actualSum = 15;
    
    assertEquals(actualSum, expectedSum);
    }


}
