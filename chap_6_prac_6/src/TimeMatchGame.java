import java.util.Calendar;
import java.util.Scanner;

public class TimeMatchGame {

	public static void main(String[] args) {
		int a1, a2, b1, b2;
		int res1, res2;
		Scanner scan = new Scanner(System.in);
		
		
				
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.println("Ȳ���� ���� <Enter>Ű>>");
		scan.nextLine();
		a1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + a1);
		
		System.out.println("10�� ���� ��  <Enter>Ű>>");
		scan.nextLine();
		a2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + a2);
		
		
		System.out.println("���繮 ���� <Enter>Ű>>");
		scan.nextLine();
		b1 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + b1);
		
		System.out.println("10�� ���� ��  <Enter>Ű>>");
		scan.nextLine();
		b2 = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + b2);
		
		
		if(a1 >= a2)
			res1 = a2 - a1 + 60;
		else
			res1 = a2 - a1;
		
		if(b1 >= b2)
			res2 = b2 - b1 + 60;
		else
			res2 = b2 - b1;
		
		System.out.print("Ȳ������ ��� " + res1 + ", ���繮�� ��� " + res2 + ", ���ڴ� ");
		
		if(Math.abs(10 - res1) < Math.abs(10 - res2))
			System.out.print("Ȳ����");
		else if(Math.abs(10 - res1) > Math.abs(10 - res2))
			System.out.print("���繮");
		else
			System.out.print("����");
		
		scan.close();
	}

}
