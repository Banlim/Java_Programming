import java.util.Scanner;
public class ArithmeticSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		double x = scan.nextDouble();
		String op = scan.next();
		double y = scan.nextDouble();
		
		double result = 0;
		
		switch(op) {
		
		case "+" :
			result = x + y;
			System.out.print(x + op + y + "의 계산 결과는 " + result);
			break;
		
		case "-" :
			result = x - y;
			System.out.print(x + op + y + "의 계산 결과는 " + result);
			break;
		
		case "*" :
			result = x * y;
			System.out.print(x + op + y + "의 계산 결과는 " + result);
			break;
			
		case "/" :
			if (y==0)
				System.out.print("0으로 나눌 수 없습니다.");
			else {
				result = x / y;
				System.out.print(x + op + y + "의 계산 결과는 " + result);
			}
			break;
		default :
			break;
		}
		scan.close();
	}
}
