import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("ù��° ������ �Է��ϼ���: ");
		x = input.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ���: ");
		y = input.nextInt();
		
		if(x>y) {
			System.out.print("�� ���� ���� �߿��� ū ���� " + x + "�Դϴ�.");
		}
		else {
			System.out.print("�� ���� ���� �߿��� ū ���� " + y + "�Դϴ�.");
		}
		input.close();
	}

}
