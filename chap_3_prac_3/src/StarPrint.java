import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		int i = scan.nextInt();
		
		if(i <= 0) {
			System.out.print("0���� ū ������ �Է��ϼ���.");
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
