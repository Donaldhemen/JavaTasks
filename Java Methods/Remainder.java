// write a method isRemainder to divide first integer by second and show emainder
// modulo = a % b and return modulo
// calculate remainderResult where a = 9, b = 3
// display remainderResult

public class Remainder {
    public static int isRemainder(int a, int b){
        int modulo = a % b;
        return modulo;
    }
    public static void main(String[] args){
        int remainderResult = isRemainder(9, 3);
        System.out.println(remainderResult);
    }
}
