import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String alpha = scan.next();
		char c = alpha.charAt(0);
		char lowerAlpha = 'a';
		
		for (char i = c; i >= lowerAlpha; i--) {
			for (char j = lowerAlpha; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
			
		}
		scan.close();
	}

}
