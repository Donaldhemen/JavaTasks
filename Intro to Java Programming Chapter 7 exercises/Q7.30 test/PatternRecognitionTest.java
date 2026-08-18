import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternRecognitionTest{

    @Test
    public void testToCheckThatTheLengthOfAnArrayIsGreaterThanOrEqualToFour(){
        int[] numbers = {3, 4, 5, 5, 5, 5, 4};
        
        boolean expectedLength = PatternRecognition.checkIfLengthIsFourOrMore(numbers);
        boolean actualLength = true;
        
        assertEquals(actualLength, expectedLength);
    }
    
    @Test
    public void testToCheckThatTheLengthOfAnArrayHasFourConsecutiveNumbers(){
        int[] numbers = {3, 4, 5, 5, 5, 5, 4};
        
        boolean expectedPattern = PatternRecognition.isConsecutiveFour(numbers);
        boolean actualPattern = true;
        
        assertEquals(actualPattern, expectedPattern);
    }
}

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out PatternRecognitionTest.java PatternRecognition.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
