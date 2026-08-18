public class DiamondStar{
    public static void main(String[] args){
        for(int row = 1; row <= 5; row++){
            for(int column = 5; column >= row; column--){
                System.out.print(" ");
            }
             for(int column = 1; column <= row; column++){
                System.out.print("*");
            }
             for(int column = 2; column <= row; column++){
                System.out.print("*");
            }
             for(int column = 5; column >= row; column--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int row = 1; row <= 4; row++){
           for(int column = 0; column <= row; column++){
                System.out.print(" ");
            }
             for(int column = 4; column >= row; column--){
                System.out.print("*"); 
            }for(int column = 3; column >= row; column--){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
