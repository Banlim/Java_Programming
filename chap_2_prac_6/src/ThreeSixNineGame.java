import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1 ~ 99 ������ ������ �Է��Ͻÿ�>> ");
		int integer = scanner.nextInt();
		int number369 = 0;
		int number = 0;
		
		number = integer%10;
		if (number == 3 || number == 6 || number == 9)
			number369++;
		number = integer/10;
		if (number == 3 || number == 6 || number == 9)
			number369++;
		if (number369 == 1)
			System.out.print("�ڼ�¦");
		else if (number369 == 2)
			System.out.print("�ڼ�¦¦");
		else
			System.out.print(integer);
		
		scanner.close();

	}

}
