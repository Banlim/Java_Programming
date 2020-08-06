
import java.util.Scanner;

class Concert{
	private String name;
	
	public Concert(){
		name = "---";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}

class ConcertSeat{
	private Concert [] seat;
	public ConcertSeat() {
		seat = new Concert[10];
		for(int i = 0; i < seat.length; i++) {
			seat[i] = new Concert();
		}
	}
	public String getName(int n) {
		return seat[n-1].getName();
	}
	public void setName(int n, String name) {
		seat[n-1].setName(name);
	}
}

public class ConcertReservation {
	private static Scanner scan = new Scanner(System.in);
	private ConcertSeat [] seatControl = new ConcertSeat[3];
	
	
	public ConcertReservation() {
		for (int i = 0; i < seatControl.length; i++) {
			seatControl[i] = new ConcertSeat();
		}
	}
	
	
	private void Input() {
		System.out.print("�¼� ���� S(1), A(2), B(3)>> ");
		int seatMenu = scan.nextInt();
		
		switch(seatMenu) {
			
		case 1 : 
			System.out.print("S>> ");
			for(int i = 0; i < 10; i++)
				System.out.print(seatControl[0].getName(i+1)+"  ");
			break;
		
		case 2 :
			System.out.print("A>> ");
			for(int i = 0; i < 10; i++)
				System.out.print(seatControl[1].getName(i+1)+"  ");
			break;
			
		case 3 : 
			System.out.print("B>> ");
			for(int i = 0; i < 10; i++)
				System.out.print(seatControl[2].getName(i+1)+"  ");
			break;
			
		default :
			System.out.print("���� ��ȣ �Դϴ�. �ٽ� �Է��ϼ���.\n");
			break;
		}
		System.out.println();
		System.out.print("�̸�>>");
		String name = scan.next();
		System.out.print("��ȣ>>");
		int n = scan.nextInt();
		seatControl[seatMenu-1].setName(n, name);
		
	}
	
	private void view() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(seatControl[i].getName(j+1) + "  ");
			}
			System.out.println();
		}
		System.out.print("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>\n");
	}
	
	private void Cancle() {
		boolean tf = true;
		int seatMenu;
		System.out.print("�¼� ���� S(1), A(2), B(3)>> ");
		
		seatMenu = scan.nextInt();
		
		switch(seatMenu) {
		
		case 1 : 
			System.out.print("S>> ");
			for(int i = 0; i < 10; i++)
				System.out.print(seatControl[0].getName(i+1)+"  ");
			break;
		
		case 2 :
			System.out.print("A>> ");
			for(int i = 0; i < 10; i++)
				System.out.print(seatControl[1].getName(i+1)+"  ");
			break;
			
		case 3 : 
			System.out.print("B>> ");
			for(int i = 0; i < 10; i++)
				System.out.print(seatControl[2].getName(i+1)+"  ");
			break;
			
		default :
			System.out.print("���� ��ȣ �Դϴ�. �ٽ� �Է��ϼ���.\n");
			break;
		}
		
		
		System.out.println();
		System.out.print("�̸�>>");
		String name = scan.next();
		for(int i = 0; i < 10; i++) {
			if(seatControl[seatMenu-1].getName(i+1).equals(name)) {
				seatControl[seatMenu-1].setName(i+1, "---");
				tf = false;
			}
		}
		
		if(tf)
			System.out.print("���� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
	}
	
	private void finish() {
		scan.close();
	}

	public static void main(String[] args) {
		boolean TF = true;
		ConcertReservation CR = new ConcertReservation();
		
		while(TF) {
			System.out.print("���� : 1, ��ȸ : 2, ��� : 3, ������ : 4 >>");
			
			int menu = scan.nextInt();
			
			switch(menu) {
			
			case 1 :
				CR.Input();
				break;
				
			case 2 :
				CR.view();
				break;
				
			case 3 :
				CR.Cancle();
				break;
				
			case 4 :
				CR.finish();
				TF = false;
				break;
			}
		}
	}

}
