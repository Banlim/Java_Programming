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
			System.out.print("없습니다.");
		else
			System.out.print(work + "입니다.");
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
		System.out.print("날짜(1~30)?");
		int day = scan.nextInt();
		System.out.print("할일(빈칸없이 입력)?");
		String work = scan.next();
		day--;
		
		if(day < 0 || day > nDays) { // 0~29 만 유효
			System.out.println("날짜 잘못 입력하였습니다.!");			
			return;
		}
		days[day].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		int day = scan.nextInt();
		day--;
		if(day<0 || day > nDays) {
			System.out.println("날짜 잘못 입력하였습니다!");			
			return;
		}
		System.out.print((day+1) + "의 할일은 " );
		days[day].show();
		
	}
	public void finish() {
		System.out.print("프로그램을 종료합니다.");
		scan.close();
	}
	public void run() {
		System.out.print("이번달 스케줄 관리 프로그램.\n");
		
		while(true) {
			System.out.print("할일(입력 : 1 , 보기 : 2, 끝내기 : 3)>>");
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
				System.out.print("잘못 입력했습니다.");
			}
			System.out.println();
			
			
		}

	}
		

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();

		
	
	}

}
