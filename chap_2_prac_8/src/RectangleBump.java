import java.util.Scanner;

public class RectangleBump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� (x1, y1), (x2, y2)�� �Է��Ͻÿ�.>>");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		boolean x1y1 = inRect(x1, y1);
		boolean x2y2 = inRect(x2, y2);
		
		if ((x1y1 == true) || (x2y2 == true))
			System.out.print("�浹�մϴ�.");
		else
			System.out.print("�浹���� �ʽ��ϴ�.");
		
		scan.close();
			
		
	}
	
	public static boolean inRect(int x, int y) {
		if((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
			return true;
		else return false;
	}

}
