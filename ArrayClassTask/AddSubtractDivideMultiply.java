// write four methods two compute two integers to add, subtract, multiply and divide
// create a general method for two int and a char so the must be "+, -, *, /" or "invalid input"
// call function in main method
// print result

public class AddSubtractDivideMultiply {
    public static double addTwoNumbers(int numberOne, int numberTwo){
        double addition = numberOne + numberTwo;

        return addition;
    }
    public static double subtractTwoNumbers(int numberOne, int numberTwo){
        double subtract = numberOne - numberTwo;

        return subtract;
    }
    public static double divideTwoNumbers(int numberOne, int numberTwo){
        double divide = numberOne / numberTwo;

        return divide;
    }
    public static int multiplyTwoNumbers(int numberOne, int numberTwo){
        return numberOne * numberTwo;


    }
    public static double AddSubtractDivideMultiply(int numberOne, int numberTwo, char symbol){
            double compute = 0;
        if(symbol == '+'){
            compute = addTwoNumbers(numberOne, numberTwo);
        }
        else if (symbol == '-'){
            compute = subtractTwoNumbers(numberOne, numberTwo);
        }
        else if (symbol == '/'){
             compute = divideTwoNumbers(numberOne, numberTwo);   
        }
        else if (symbol == '*'){
             compute = multiplyTwoNumbers(numberOne, numberTwo);  
        }
        else {
             System.out.print("Invalid input");
        }
        return compute;
    }
    public static void main(String[] args){
       

        System.out.println(AddSubtractDivideMultiply(1, 2, '/'));
    }
}
