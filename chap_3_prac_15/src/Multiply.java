import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("곱하고자 하는 두 수 입력>>");
		try {
			int n = scan.nextInt();
			int m = scan.nextInt();
		
			System.out.print(n + "x" + m + " = " + n*m);
			break;
		}catch(InputMismatchException e) {
			System.out.print("실수는 입력하면 안됩니다.\n");
			scan.nextLine();
			continue;
			
		}
		}while(true);
		
		scan.close();

	}

}
