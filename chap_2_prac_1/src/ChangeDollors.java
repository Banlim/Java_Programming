import java.util.Scanner;

public class ChangeDollors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double ȯ�� = 1100.0;
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
		int money = scanner.nextInt();
		double dollar = money/ȯ��;
		System.out.print(money + "���� $" + dollar + "�Դϴ�.");
		scanner.close();
		

	}

}
