import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.print("년도를 입력하시오: ");
		year = input.nextInt();
		
		boolean LeapYear;
		
		LeapYear = (year % 4 == 0);
		System.out.println(LeapYear);
		input.close();
	}
}
