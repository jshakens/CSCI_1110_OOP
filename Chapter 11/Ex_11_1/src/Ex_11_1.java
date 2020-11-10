import java.util.Scanner;

public class Ex_11_1 {

    public static void main(String[] args) {
	Triangle triangle;
	triangle = new Triangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter side 1 of triangle: ");
		double S1 = scanner.nextDouble();
		System.out.print("Enter side 2 of triangle: ");
		double S2 = scanner.nextDouble();
		System.out.print("Enter side 3 of triangle: ");
		double S3 = scanner.nextDouble();
	triangle.triangle(S1,S2,S3);
	triangle.string();

	triangle.triangleColor("Blue", true);
	triangle.getPerimeter();
	triangle.getArea();

    }
}
