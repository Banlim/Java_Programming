import java.util.Scanner;

public class CenterNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է� >>");
		int integer1 = scanner.nextInt();
		int integer2 = scanner.nextInt();
		int integer3 = scanner.nextInt();
		
		if ((integer2 < integer1 && integer1 < integer3) || (integer3 < integer1 && integer1 < integer2))
				System.out.print("�߰� ���� " + integer1 + "\n");
		if ((integer1 < integer2 && integer2 < integer3) || (integer3 < integer2 && integer2 < integer1))
				System.out.print("�߰� ���� " + integer2 + "\n");
		if ((integer1 < integer3 && integer3 < integer2) || (integer2 < integer3 && integer3 < integer1))
				System.out.print("�߰� ����" + integer3 + "\n");
		
		scanner.close();
		

	}

}
