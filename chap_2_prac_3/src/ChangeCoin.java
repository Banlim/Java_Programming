import java.util.Scanner;

public class ChangeCoin {
	
	final static int fiveman = 50000;
	final static int man = 10000;
	final static int cheon = 1000;
	final static int fivehund = 500;
	final static int hund = 100;
	final static int fifty = 50;
	final static int ten = 10;
	final static int one = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		int number;
		
		number = money/fiveman;
		money = money%fiveman;
		if (number>0)
			System.out.print("오만원권" + number + "매\n");
		
		number = money/man;
		money = money%man;
		if (number > 0)
			System.out.print("만원권" + number + "매\n");
		
		number = money/cheon;
		money = money%cheon;
		if (number > 0)
			System.out.print("천원권" + number + "매\n");
		
		number = money/fivehund;
		money = money%fivehund;
		if (number > 0)
			System.out.print("오백원" + number + "개\n");
		
		number = money/hund;
		money = money%hund;
		if (number > 0)
			System.out.print("백원" + number + "개\n");
		
		number = money/fifty;
		money = money%fifty;
		if (number > 0)
			System.out.print("오십원" + number + "개\n");
		
		number = money/ten;
		money = money%ten;
		if (number > 0)
			System.out.print("십원" + number + "개\n");
		
		number = money/one;
		if (number > 0)
			System.out.print("일원" + number + "개");
			
		scanner.close();
	}

}
