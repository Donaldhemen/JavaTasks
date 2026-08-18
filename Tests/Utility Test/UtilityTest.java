import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UtilityTest{


	@Test
	void testThatICountTheNumberOfElementsInAnArray_CountIsEqualToLength(){
		char [] characters = {'a','1','d','g','y','k','i','9','u','u','8','t','y'};

		int numberOfCharacters =  characters.length;
		int countedCharacters = Utility.countOf(characters);

		assertEquals(numberOfCharacters, countedCharacters);

	}

	@Test
	void testThatICountTheNumberOfCharactersInAString_CountIsEqualToLength(){
		
		String word = "qweretyjgfdsvfn"; 
			
		int numberOfCharacters =  word.length();
		int countedCharacters = Utility.countOf(word);

		assertEquals(numberOfCharacters, countedCharacters);

	}

	@Test
	void wordSpeltBackwardsIsSameAsOriginalWordTest(){
		String name = "Rose";

		String reversedName = "esoR";

		Utility stringUtility = new Utility();
		String expectedText = stringUtility.reverse(name);
		
		assertEquals(reversedName, expectedText);		

	}

	@Test
	void collectionArrangedBackwardsIsSameAsOriginalCollectionTest(){
		String [] names = {"Rose", "Kemi", "VDM", "Ugo"};

		String [] mirroredNames = {"Ugo", "VDM", "Kemi", "Rose"};


		Utility stringUtility = new Utility();
		String [] expectedReversedArray = stringUtility.reverse(names);

		
		assertArrayEquals(mirroredNames, expectedReversedArray);	
	

	}

	@Test
	void testThatIExtractFromTwoIndicesNewWordFromTheIndicesIsFormed(){
		
		String word = "qwereytyjgfdsvfn"; 
			
		String actualExtractedText =  "werey";
		String expectedExtractedText = Utility.extractFrom(word, 1, 5);

		assertEquals(actualExtractedText, expectedExtractedText);

	}


	@Test
	void testThatNoExtractOccursIfEndingIndexIsLessThanStartingIndex(){
		
		String word = "qwereytyjgfdsvfn"; 
			
		String actualExtractedText =  "";
		String expectedExtractedText = Utility.extractFrom(word, 5, -1);

		assertEquals(actualExtractedText, expectedExtractedText);

	}


	@Test
	void testThatExtractOccursIfEndingIndexIsLessThanStartingIndex(){
		
		String word = "qwereytyjgfdsvfn"; 
			
		String actualExtractedText =  "werey";
		String expectedExtractedText = Utility.extractFrom(word, 5, 1);

		assertEquals(actualExtractedText, expectedExtractedText);

	}





}
