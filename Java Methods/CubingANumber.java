// write a method isCube to cube an integer a
// cube = a * a * a and return cube
// calculate cubeResult where a = 3
// display result

public class CubingANumber {
    public static int isCube(int a){
        int cube = a * a * a;
        return cube;
    }
    
    public static void main(String[] args){
        int cubeResult = isCube(3);
        System.out.println(cubeResult);
    }
}
