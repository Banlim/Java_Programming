import java.util.Scanner;

public class CircularStringPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고, 영어, 한글 모두 됩니다.");
		
		a = scan.nextLine();
		
		for(int i = a.length(); i > 0; i--) {
			System.out.println(a.substring(a.length() - i) + a.substring(0, a.length()-i));
		}
		scan.close();
	}

}
