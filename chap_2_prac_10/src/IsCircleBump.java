import java.util.Scanner;

public class IsCircleBump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		double Acen1 = scan.nextDouble();
		double Acen2 = scan.nextDouble();
		double Ar = scan.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		double Bcen1 = scan.nextDouble();
		double Bcen2 = scan.nextDouble();
		double Br = scan.nextDouble();
		
		double CenterDistance = Math.sqrt((Acen1-Bcen1)*(Acen1-Bcen1) + (Acen2-Bcen2)*(Acen2-Bcen2));
		double rSum = Ar + Br;
		
		if (CenterDistance < rSum)
			System.out.print("�� ���� ���� ��ģ��.");
		else
			System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
		
		scan.close();
	}

}
