import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class FibonacciArrayTest{

    @Test
    public void testToReturnAnArrayOfAGivenNumberOfFibonacciSequence(){
    
    //Given
    int number = 7;
    
    //When
    int[] expectedSequence = FibonacciArray.getFibonacciOfFirst(number);
    int[] actualSequence = {0, 1, 1, 2, 3, 5, 8};
    
    //Check
    assertArrayEquals(actualSequence, expectedSequence);
    }
    
}
