import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����>>");
		double x = scan.nextDouble();
		String operator = scan.next();
		double y = scan.nextDouble();
		
		double result = 0;
		
		if (operator.equals("+")) {
			result = x + y;
			System.out.print(x + operator + y + "�� ��� ����� " + result);
		}
		else if (operator.equals("-")) {
			result = x - y;
			System.out.print(x + operator + y + "�� ��� ����� " + result);
		}
		else if (operator.equals("*")) {
			result = x * y;
			System.out.print(x + operator + y + "�� ��� ����� " + result);
		}
		else if (operator.equals("/")) {
			if (y == 0)
				System.out.print("0���� ���� �� �����ϴ�.");
			else {
				result = x / y;
				System.out.print(x + operator + y + "�� ��� �����" + result);
			}
		}
		scan.close();
	}
}
