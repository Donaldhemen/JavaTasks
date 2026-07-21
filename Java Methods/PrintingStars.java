// write a method to printstars that takes an integer and prints asterisk on a single line
// use for i = 0; i < a; i++
// print"*" return nothing
// use printStars(4) 
// display printStars(4)

public class PrintingStars {
    public static void printStars(int a){
        for (int i = 0; i < a; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args){
        printStars(4);
        System.out.println();
    }   
}
