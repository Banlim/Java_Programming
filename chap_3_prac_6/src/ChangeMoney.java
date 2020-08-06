import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("금액을 입력하시오>>"); // 환산할 돈의 종류
		
		int money = scan.nextInt();
		int number = 0;
		
		for (int i = 0; i < unit.length; i++) {
			number = money/unit[i];
			money = money%unit[i];
			
			if(number>0) {
				System.out.print(unit[i] + "원 짜리 : " + number + "개 \n");
			}
		}
		scan.close();
	}

}
