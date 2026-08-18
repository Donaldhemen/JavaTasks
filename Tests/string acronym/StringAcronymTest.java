import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class StringAcronymTest{

    @Test
    public void testToFormAnAcronymUsingTheFirstLettersOfASentence(){
    
    //Given
    String sentence = "John is a dark young man";
    
   //When
   String[] expectedResult = StringAcronym.stringTo(sentence);
   String[] actualResult = "Jiadym";
   //check
   assertEquals(actualResult, expectedResult); 
    }
}
