import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.print("�⵵�� �Է��Ͻÿ�: ");
		year = input.nextInt();
		
		boolean LeapYear;
		
		LeapYear = (year % 4 == 0);
		System.out.println(LeapYear);
		input.close();
	}
}
