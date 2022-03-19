import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("첫번째 정수를 입력하세요: ");
		x = input.nextInt();
		
		System.out.print("두번째 정수를 입력하세요: ");
		y = input.nextInt();
		
		if(x>y) {
			System.out.print("두 개의 정수 중에서 큰 수는 " + x + "입니다.");
		}
		else {
			System.out.print("두 개의 정수 중에서 큰 수는 " + y + "입니다.");
		}
		input.close();
	}

}
