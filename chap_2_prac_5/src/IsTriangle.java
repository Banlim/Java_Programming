import java.util.Scanner;

public class IsTriangle {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("���� 3�� �Է��Ͻÿ� >> ");
	
	int int1 = scanner.nextInt();
	int int2 = scanner.nextInt();
	int int3 = scanner.nextInt();
	
	if((int1+int2) < int3 || (int1+int3) < int2 || (int2+int3) < int1)
		System.out.print("�ﰢ���� ���� �� �����ϴ�. \n");
	else
		System.out.print("�ﰢ���� ���� �� �ֽ��ϴ�.");
	
	scanner.close();

	}

}
