// write a method to add all the factors of an integer a including 1
// if the sum of the factors equal a perfect number then return true
// sumOfFactors = 0
// for count = 1 and count < a, count ++
// if a % count == 0 then sumOfFactors += count
// if a == sumOfFactors, return true
// else return false 
// use method PerfectNumbers in program
// display perfectResult

public class PerfectNumbers {
    public static boolean isPerfect(int a){
        int sumOfFactors = 0;
        for (int count = 1; count < a; count++){
            if (a % count == 0){
                sumOfFactors += count;
            }
        }
        
        if (a == sumOfFactors){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        boolean perfectResult = isPerfect(6);
        System.out.println(perfectResult);
    }  
}
