public class CircleArea {
	public static void main(String[] args) {
	double radius = 5.5;
	double pi = 22 / 7;

	double perimeter = 2 * radius * pi;
	double area = radius * radius * pi;

	System.out.printf("Perimeter is %f Area is %f ", perimeter, area);
}
}
