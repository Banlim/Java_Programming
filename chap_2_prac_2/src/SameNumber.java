import java.util.Scanner;

public class SameNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int integer = scanner.nextInt();
		if (integer%11 == 0)
			System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�!");
		else
			System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�!");
		scanner.close();
	}

}
