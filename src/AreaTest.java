import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner input = new Scanner(System.in);
		
		double radius;
		
		System.out.print("반지름 값을 입력하시오: ");
		radius = input.nextDouble();
		
		final double PI = 3.141592;
		double area = radius * radius * PI;
		
		System.out.println("반지름이" + radius + "인 원의 면적은" + area + "입니다.");
		input.close();
	}
}