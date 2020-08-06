import java.util.Calendar;
import java.util.Scanner;

public class TimeMatchGame {

	public static void main(String[] args) {
		int a1, a2, b1, b2;
		int res1, res2;
		Scanner scan = new Scanner(System.in);
		
		
				
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.println("황기태 시작 <Enter>키>>");
		scan.nextLine();
		a1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + a1);
		
		System.out.println("10초 예상 후  <Enter>키>>");
		scan.nextLine();
		a2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + a2);
		
		
		System.out.println("이재문 시작 <Enter>키>>");
		scan.nextLine();
		b1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + b1);
		
		System.out.println("10초 예상 후  <Enter>키>>");
		scan.nextLine();
		b2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + b2);
		
		
		if(a1 >= a2)
			res1 = a2 - a1 + 60;
		else
			res1 = a2 - a1;
		
		if(b1 >= b2)
			res2 = b2 - b1 + 60;
		else
			res2 = b2 - b1;
		
		System.out.print("황기태의 결과 " + res1 + ", 이재문의 결과 " + res2 + ", 승자는 ");
		
		if(Math.abs(10 - res1) < Math.abs(10 - res2))
			System.out.print("황기태");
		else if(Math.abs(10 - res1) > Math.abs(10 - res2))
			System.out.print("이재문");
		else
			System.out.print("없음");
		
		scan.close();
	}

}
