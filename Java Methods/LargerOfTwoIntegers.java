// write a method largerInteger to that checks the larger value of two integers a and b
// int larger
// if a > b larger = a
// else larger = b, return larger
// calculate largerResult in the program
// display largerResult

public class LargerOfTwoIntegers {
    public static int largerInteger(int a, int b){       
        int larger;       
        if (a > b){
          larger = a; 
        }
        else {
           larger = b;
        }
        return larger;  
    }
    public static void main(String[] args){
        int largerResult = largerInteger(3, 6);
        System.out.println(largerResult);
    }
}
