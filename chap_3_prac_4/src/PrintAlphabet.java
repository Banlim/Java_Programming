import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
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
