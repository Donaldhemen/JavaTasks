// write a method divisibiltyByThree to take integer a
// if a is divible by 3 return true
// else return false
// check divisibleResult in the program
// display result

public class DivisibleByThree {
    public static boolean divisibleByThree(int a){
        if (a % 3 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        boolean divisibleResult = divisibleByThree(9);
        System.out.println(divisibleResult);
    }
}
