import java.util.Scanner;
public class ArithmeticSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����>>");
		double x = scan.nextDouble();
		String op = scan.next();
		double y = scan.nextDouble();
		
		double result = 0;
		
		switch(op) {
		
		case "+" :
			result = x + y;
			System.out.print(x + op + y + "�� ��� ����� " + result);
			break;
		
		case "-" :
			result = x - y;
			System.out.print(x + op + y + "�� ��� ����� " + result);
			break;
		
		case "*" :
			result = x * y;
			System.out.print(x + op + y + "�� ��� ����� " + result);
			break;
			
		case "/" :
			if (y==0)
				System.out.print("0���� ���� �� �����ϴ�.");
			else {
				result = x / y;
				System.out.print(x + op + y + "�� ��� ����� " + result);
			}
			break;
		default :
			break;
		}
		scan.close();
	}
}
