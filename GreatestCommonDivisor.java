//declare numberOne and numberTwo
// the biggest divisor is the larger number divided by the smaller number or the remainder of their division
// get a temporary to swap when the first number is smaller than the second
//   

public class GreatestCommonDivisor{
    public static void main(String[] args){
        int numberOne = 25;
        int numberTwo = 33;
        int temp = 0;
         while (numberOne != 0) {
            temp = numberOne;   
            numberOne = numberTwo % numberOne;  
            numberTwo = temp;    
        }
        System.out.println(temp);
    }

}
