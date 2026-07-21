// write a method addTen to an integer a
// add = a + 10
// calculate addTenResult in program
// display addTenResult

public class AddingTen {
    public static int addTen(int a){
        int add = a + 10;
        return add;
    }
    
    public static void main(String[] args){
        int addTenResult = addTen(15);
        System.out.println(addTenResult);
    }
}
