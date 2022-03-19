import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("월을 입력하세요: ");
		x = input.nextInt();
		
		switch(x) 
		{
			case 1,3,5,7,8,10,12:
				System.out.print(x + "월의 일수는 31일입니다.");
				break;
			case 2:
				System.out.print(x + "월의 일수는 28일입니다.");
				break;
			case 4,6,9,11:
				System.out.print(x + "월의 일수는 30일입니다.");
				break;		
		}
		input.close();
	}

}
