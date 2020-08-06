import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public void set(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class PhoneBook {
	
	private int num; // �ο���
	private Phone [] phones;
	private Scanner scan = new Scanner(System.in);
	
	public PhoneBook(int num) {
		phones = new Phone[num];
		for(int i = 0; i < num; i++)
			phones[i] = new Phone();
		
		this.num = num;
	}
	public void Input() {
		for (int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȭ��ȣ�� �� ĭ ���� �Է�)>>");
			String name = scan.next();
			String tel = scan.next();
			phones[i].set(name, tel);
		}
		System.out.print("����Ǿ����ϴ�...\n");
	}
	public boolean Search() {
		
		System.out.print("�˻��� �̸�>>");
		String name = scan.next();
		boolean trueORfalse = true;
		
		if (name.equals("�׸�")) {
			scan.close();
			return false;
			
		}
		
		for (int i = 0; i < num; i++) {
			if(phones[i].getName().equals(name)) {
				System.out.print(name + "�� ��ȣ�� " + phones[i].getTel() + "�Դϴ�.\n");
				trueORfalse = false;
			}
		}
		if (trueORfalse)
			System.out.print(name + "�� �����ϴ�.");
		
		return true;
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean tf = true;
		System.out.print("�ο���>>");
		int num = scan.nextInt();
		
		PhoneBook ph = new PhoneBook(num);
		ph.Input();
		
		while(tf) {
			tf = ph.Search();
		}
		scan.close();

	}

}
