import java.util.Scanner;

public class CircularStringPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ�, ����, �ѱ� ��� �˴ϴ�.");
		
		a = scan.nextLine();
		
		for(int i = a.length(); i > 0; i--) {
			System.out.println(a.substring(a.length() - i) + a.substring(0, a.length()-i));
		}
		scan.close();
	}

}
