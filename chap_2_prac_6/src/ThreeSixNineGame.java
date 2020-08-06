import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1 ~ 99 사이의 정수를 입력하시오>> ");
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
			System.out.print("박수짝");
		else if (number369 == 2)
			System.out.print("박수짝짝");
		else
			System.out.print(integer);
		
		scanner.close();

	}

}
