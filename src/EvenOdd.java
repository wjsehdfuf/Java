import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		x = input.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		}
		else {
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		input.close();
	}

}
