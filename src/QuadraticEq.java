public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b = -3.0;
		double c = 2.0;
		
		double root = Math.sqrt(b * b - 4.0 * c);
		
		double r1 = (-b + root) / 2.0;
		double r2 = (-b - root) / 2.0;
		
		System.out.println("ù��° �� : " + r1);
		System.out.println("�ι�° �� : " + r2);


	}

}
