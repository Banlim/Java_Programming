import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean TF = true;
		while(TF) {
			String str;
			System.out.print(">>");
			str = scan.nextLine();
			if(str.equals("�׸�")) {
				TF = false;
				break;
			}
			StringTokenizer st = new StringTokenizer(str, " ");
			System.out.println("���� ������ " + st.countTokens());
			
		}
		scan.close();

	}

}
