import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		try {
			int n = scan.nextInt();
			int m = scan.nextInt();
		
			System.out.print(n + "x" + m + " = " + n*m);
			break;
		}catch(InputMismatchException e) {
			System.out.print("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.\n");
			scan.nextLine();
			continue;
			
		}
		}while(true);
		
		scan.close();

	}

}
