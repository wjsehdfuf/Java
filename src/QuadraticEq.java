import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		float b;
		float c;
		
		System.out.print("b�� ���� �Է��Ͻÿ�: ");
		b = input.nextFloat();
		
		System.out.print("c�� ���� �Է��Ͻÿ�: ");
		c = input.nextFloat();
		
		double root = Math.sqrt(b * b - 4.0 * c);
		
		double r1 = (-b + root) / 2.0;
		double r2 = (-b - root) / 2.0;
		
		System.out.println("ù��° �� : " + r1);
		System.out.println("�ι�° �� : " + r2);
		input.close();
	}

}
