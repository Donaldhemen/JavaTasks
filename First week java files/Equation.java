public class Equation {
	public static void main(String[] args) {
	double a = 3.4;		
	double b = 50.2;
	double c = 44.5;
	double d = 2.1;
	double e = 55;
	double f = 5.9;
	double x = (e * d - b * f) / (a * d - b * c);
	double y = (a * f - e * c) / (a * d - b * c);
	System.out.printf("x is %f, y is %f ", x, y);
}
}