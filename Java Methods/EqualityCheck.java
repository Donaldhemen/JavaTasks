// write a method equalityCheck to that checks if two integers a and b are equal
// if a == b return true
// else return false
// calculate equalityResult in the program
// display equalityResult

public class EqualityCheck {
    public static boolean equalityCheck(int a, int b){
        if (a == b){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        boolean equalityResult = equalityCheck(4, 4);
        System.out.println(equalityResult);
    }
