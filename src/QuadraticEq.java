import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		float b;
		float c;
		
		System.out.print("b의 값을 입력하시오: ");
		b = input.nextFloat();
		
		System.out.print("c의 값을 입력하시오: ");
		c = input.nextFloat();
		
		double root = Math.sqrt(b * b - 4.0 * c);
		
		double r1 = (-b + root) / 2.0;
		double r2 = (-b - root) / 2.0;
		
		System.out.println("첫번째 근 : " + r1);
		System.out.println("두번째 근 : " + r2);
		input.close();
	}

}
