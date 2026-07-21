// write a method smallerInteger to that checks the smaller value of two integers a and b
// int smaller
// if a < b smaller = a
// else smaller = b and returns smaller
// calculate smallerResult in the program
// display smallerResult


public class SmallerOfTwoIntegers {
    public static int smallerInteger(int a, int b){       
        int smaller;       
        if (a < b){
          smaller = a; 
        }
        else {
           smaller = b;
        }
        return smaller;  
    }
    public static void main(String[] args){
        int smallerResult = smallerInteger(3, 6);
        System.out.println(smallerResult);
    }
}
