import java.util.Scanner;

public class IsCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double center1 = scan.nextDouble();
		double center2 = scan.nextDouble();
		double r = scan.nextDouble();
		
		System.out.print("�� �Է�>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		double distance = Math.sqrt((center1 - x)*(center1 - x) + (center2 - y)*(center2 - y));
				
		if(distance <= r)
			System.out.print("�� (" + x + "," + y + ")�� �� �ȿ� �ִ�.");
		else
			System.out.print("�� (" + x + "," + y + ")�� �� �ȿ� ����.");
		
		scan.close();
		

	}

}
