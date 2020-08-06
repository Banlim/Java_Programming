import java.util.Scanner;

public class ChangeDollors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double 환율 = 1100.0;
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int money = scanner.nextInt();
		double dollar = money/환율;
		System.out.print(money + "원은 $" + dollar + "입니다.");
		scanner.close();
		

	}

}
