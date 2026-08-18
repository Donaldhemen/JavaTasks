public class PrimesIn100{
    public static void main(String[] args){
        
        int primecount = 0;
        for(int count = 1; count <= 100; count++){
            primecount = 0;
            for(int index = 1; index <= count; index++){
                if(count % index == 0){
                    primecount++;
                }
            }
            if (primecount == 2){
                System.out.print(count+ " ");
            }
         
        }
        
    }
}
