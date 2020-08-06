import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int i = scan.nextInt();
		
		if(i <= 0) {
			System.out.print("0보다 큰 정수를 입력하세요.");
			scan.close();
			return;
		}
		
		for (int k = i; k > 0; k--) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		scan.close();
	}

}
