import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		double x = scan.nextDouble();
		String operator = scan.next();
		double y = scan.nextDouble();
		
		double result = 0;
		
		if (operator.equals("+")) {
			result = x + y;
			System.out.print(x + operator + y + "의 계산 결과는 " + result);
		}
		else if (operator.equals("-")) {
			result = x - y;
			System.out.print(x + operator + y + "의 계산 결과는 " + result);
		}
		else if (operator.equals("*")) {
			result = x * y;
			System.out.print(x + operator + y + "의 계산 결과는 " + result);
		}
		else if (operator.equals("/")) {
			if (y == 0)
				System.out.print("0으로 나눌 수 없습니다.");
			else {
				result = x / y;
				System.out.print(x + operator + y + "의 계산 결과는" + result);
			}
		}
		scan.close();
	}
}
