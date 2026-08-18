
public class WeekendDose{

    public static int calculateSumToN(int number){
    
        int sum = 0;
        for(int count = 1; count <= number; count++){
            sum += count;
        }
        return sum;
    }
}
