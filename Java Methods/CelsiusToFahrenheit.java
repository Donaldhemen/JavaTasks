// write a method CelsiusToFahrenheit to convert temparture in celsius to fahrenheit
// fahrenheit = c * 9 / 5) + 32 and return fahrenheit
// calculate fahrenheitResult where c = 18
// display fahrenheitResult

public class CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(int c) {
            double fahrenheit = (c * 9 / 5) + 32;
            return fahrenheit;
    }
    public static void main(String[] args){
        double fahrenheitResult = celsiusToFahrenheit (18);
        System.out.println(fahrenheitResult);
    }
}
    
