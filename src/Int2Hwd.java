import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		x = input.nextInt();
		
		switch(x)
		{
			case 1:
				System.out.print("�ϳ�");
				break;
			case 2:
				System.out.print("��");
				break;
			case 3:
				System.out.print("��");
				break;
			default:
				System.out.print("����");
				break;
		}
		input.close();
	}
}
