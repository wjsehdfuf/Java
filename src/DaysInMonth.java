import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("���� �Է��ϼ���: ");
		x = input.nextInt();
		
		switch(x) 
		{
			case 1,3,5,7,8,10,12:
				System.out.print(x + "���� �ϼ��� 31���Դϴ�.");
				break;
			case 2:
				System.out.print(x + "���� �ϼ��� 28���Դϴ�.");
				break;
			case 4,6,9,11:
				System.out.print(x + "���� �ϼ��� 30���Դϴ�.");
				break;		
		}
		input.close();
	}

}
