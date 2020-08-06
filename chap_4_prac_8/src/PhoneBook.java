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
	
	private int num; // 인원수
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
			System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸 없이 입력)>>");
			String name = scan.next();
			String tel = scan.next();
			phones[i].set(name, tel);
		}
		System.out.print("저장되었습니다...\n");
	}
	public boolean Search() {
		
		System.out.print("검색할 이름>>");
		String name = scan.next();
		boolean trueORfalse = true;
		
		if (name.equals("그만")) {
			scan.close();
			return false;
			
		}
		
		for (int i = 0; i < num; i++) {
			if(phones[i].getName().equals(name)) {
				System.out.print(name + "의 번호는 " + phones[i].getTel() + "입니다.\n");
				trueORfalse = false;
			}
		}
		if (trueORfalse)
			System.out.print(name + "이 없습니다.");
		
		return true;
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean tf = true;
		System.out.print("인원수>>");
		int num = scan.nextInt();
		
		PhoneBook ph = new PhoneBook(num);
		ph.Input();
		
		while(tf) {
			tf = ph.Search();
		}
		scan.close();

	}

}
