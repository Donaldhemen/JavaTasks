// write a method absoluteValue that returns absolute value of an integer a
// if a < 0 abs = 0 - a
// else abs = a
// calculate absolute result in program
// display rseult

public class AbsoluteValueOfInteger {
    public static int absoluteValue(int a){
        if (a < 0){
            int abs = 0 - a;
            return abs;
        }
        else {
            int abs = a;
            return abs;
        }
    }
    public static void main(String[] args){
        int absoluteResult = absoluteValue(-9);
        
        System.out.println(absoluteResult);    
    }
}
