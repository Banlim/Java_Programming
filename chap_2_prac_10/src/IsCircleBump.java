import java.util.Scanner;

public class IsCircleBump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		double Acen1 = scan.nextDouble();
		double Acen2 = scan.nextDouble();
		double Ar = scan.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		double Bcen1 = scan.nextDouble();
		double Bcen2 = scan.nextDouble();
		double Br = scan.nextDouble();
		
		double CenterDistance = Math.sqrt((Acen1-Bcen1)*(Acen1-Bcen1) + (Acen2-Bcen2)*(Acen2-Bcen2));
		double rSum = Ar + Br;
		
		if (CenterDistance < rSum)
			System.out.print("두 원은 서로 겹친다.");
		else
			System.out.print("두 원은 서로 겹치지 않는다.");
		
		scan.close();
	}

}
