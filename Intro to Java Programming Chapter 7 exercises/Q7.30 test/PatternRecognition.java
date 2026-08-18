import java.util.Arrays;

public class PatternRecognition{

    public static boolean checkIfLengthIsFourOrMore(int[] values){
        boolean lengthCheck = true;
        if(values.length >= 4){
            lengthCheck = true;
        }
        else{
            lengthCheck = false;
        }
        return lengthCheck;
    }
    
    public static boolean isConsecutiveFour(int[] values){
        if (checkIfLengthIsFourOrMore(values)){
            return true;
        }
        int count = 1;
        
        for(int index = 0; index < values.length-1; index++){
            if(values[index] == values[index+1]){
                count ++; 
            
            if (count == 4)return true;
            
            } else {
                count = 1;
            }
        }
        
        return false;
    }
}
