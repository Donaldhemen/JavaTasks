import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IdenticalArraysTest{
    
    @Test
    public void testToCheckThatTwoArraysAreIdenticalBySize(){
    //Given
    int[] listOne = {5, 2, 5, 6, 1, 6};
    int[] listTwo = {5, 2, 5, 6, 1, 6};
    
    //When
    boolean expectedLength = IdenticalArrays.equalsArrayLength(listOne, listTwo);
    boolean actualLength = true;
    
    //check
    assertEquals(actualLength, expectedLength);
    }

    @Test
    public void testToCheckThatTwoArraysAreIdenticalBySizeAndElementsArrangements(){
    //Given
    int[] listOne = {5, 2, 5, 6, 1, 6};
    int[] listTwo = {5, 2, 5, 6, 1, 6};
    
    //When
    boolean expectedResult = IdenticalArrays.equals(listOne, listTwo);
    boolean actualResult = true;
    
    //check
    assertEquals(actualResult, expectedResult);
    }
       @Test
    public void testToCheckThatTwoArraysAreNotIdenticalBySizeOrElementsArrangements(){
    //Given
    int[] listOne = {5, 2, 5, 6, 6, 1};
    int[] listTwo = {5, 2, 5, 6, 1, 6};
    
    //When
    boolean expectedResult = IdenticalArrays.equals(listOne, listTwo);
    boolean actualResult = false;
    
    //check
    assertEquals(actualResult, expectedResult);
    }
}

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out IdenticalArraysTest.java IdenticalArrays.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
