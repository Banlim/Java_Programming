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
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		int number;
		
		number = money/fiveman;
		money = money%fiveman;
		if (number>0)
			System.out.print("��������" + number + "��\n");
		
		number = money/man;
		money = money%man;
		if (number > 0)
			System.out.print("������" + number + "��\n");
		
		number = money/cheon;
		money = money%cheon;
		if (number > 0)
			System.out.print("õ����" + number + "��\n");
		
		number = money/fivehund;
		money = money%fivehund;
		if (number > 0)
			System.out.print("�����" + number + "��\n");
		
		number = money/hund;
		money = money%hund;
		if (number > 0)
			System.out.print("���" + number + "��\n");
		
		number = money/fifty;
		money = money%fifty;
		if (number > 0)
			System.out.print("���ʿ�" + number + "��\n");
		
		number = money/ten;
		money = money%ten;
		if (number > 0)
			System.out.print("�ʿ�" + number + "��\n");
		
		number = money/one;
		if (number > 0)
			System.out.print("�Ͽ�" + number + "��");
			
		scanner.close();
	}

}
