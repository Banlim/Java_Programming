import java.util.Scanner;
public class NumberSeason {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>> ");
		int month = scan.nextInt();
		
		if (month >= 3 && month <=5)
			System.out.print("��");
		else if (month >= 6 && month <= 8)
			System.out.print("����");
		else if (month >= 9 && month <= 11)
			System.out.print("����");
		else if (month == 12 || month == 1 || month == 2)
			System.out.print("�ܿ�");
		else
			System.out.print("�߸� �Է�");
		
		scan.close();
	}

}
