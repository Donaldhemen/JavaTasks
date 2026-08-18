import java.util.Arrays;

public class IdenticalArrays{

    public static boolean equalsArrayLength(int[] list1, int[] list2){
        boolean sameLength = true;
        if(list1.length == list2.length){
            sameLength = true;
        }
        else{
            sameLength = false;
        } 
        return sameLength;
    }
    public static boolean equals(int[] list1, int[] list2){
    boolean identical = true;
    for(int index = 0; index < list1.length; index++){
        if (list1[index] == list2[index]){
            identical = true;  
        }
        else{
            identical = false;
        }
    }
    return identical;
    }
}
