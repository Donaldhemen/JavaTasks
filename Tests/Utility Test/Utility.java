public class Utility{

	public static int countOf(char [] characters){
		int count = 0;
		for(char character : characters) {
			count++;
}
		return count;
	}

		public static int countOf(String text){
		String [] characters = text.split("");
		
		int count = 0; 

		for(String character : characters) count++;

		return count;
	
	}
	
	public String reverse(String word){
		String reversedText = "";
		for(int index = word.length() - 1; index >= 0 ; index--) reversedText+=word.charAt(index);
		return reversedText;
	}

	public String[] reverse(String[] collection){
		String [] newCollection = new String [collection.length];
		int leadingIndex = 0;
		for(int index = collection.length- 1; index >= 0 ; index--) {
			newCollection[index] = collection[leadingIndex];
			leadingIndex++;
		
		}
		return newCollection;
	}

	public static String extractFrom(String text, int startingIndex, int endingIndex){
		if (endingIndex < 0 || startingIndex < 0) return "";

		if(endingIndex < startingIndex){
			startingIndex = endingIndex + startingIndex;
			endingIndex =  startingIndex - endingIndex;
			startingIndex = startingIndex - endingIndex;
		}				
		String newWord = "";

		for(int index = startingIndex; index <= endingIndex; index ++){
			newWord += text.charAt(index);
		}

		return newWord;
	}

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out UtilityTest.java Utility.java
//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
	


}
