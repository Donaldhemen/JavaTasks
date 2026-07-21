// write a method halveNumber that halves an integer and returns decimal
// half = a / 2 and return half
// calculate halfResult in the program 
// display result

public class HalvingANumber {
    public static double halveNumber(int a){
        double half = a / 2.0;
        return half;
    }

    public static void main(String[] args){
        double halfResult = halveNumber(5);
        System.out.println(halfResult);
    }
}
