import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null)
			System.out.print("�����ϴ�.");
		else
			System.out.print(work + "�Դϴ�.");
	}
}
public class MonthSchedule {
	private int nDays;
	private Day [] days;
	private Scanner scan;
	
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day [nDays];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		scan = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("��¥(1~30)?");
		int day = scan.nextInt();
		System.out.print("����(��ĭ���� �Է�)?");
		String work = scan.next();
		day--;
		
		if(day < 0 || day > nDays) { // 0~29 �� ��ȿ
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.!");			
			return;
		}
		days[day].set(work);
	}
	public void view() {
		System.out.print("��¥(1~30)?");
		int day = scan.nextInt();
		day--;
		if(day<0 || day > nDays) {
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�!");			
			return;
		}
		System.out.print((day+1) + "�� ������ " );
		days[day].show();
		
	}
	public void finish() {
		System.out.print("���α׷��� �����մϴ�.");
		scan.close();
	}
	public void run() {
		System.out.print("�̹��� ������ ���� ���α׷�.\n");
		
		while(true) {
			System.out.print("����(�Է� : 1 , ���� : 2, ������ : 3)>>");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1 :
				input();
				break;
			case 2:
				view();
				break;
			case 3 :
				finish();
				return;
			default :
				System.out.print("�߸� �Է��߽��ϴ�.");
			}
			System.out.println();
			
			
		}

	}
		

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4������ �� ��
		april.run();

		
	
	}

}
