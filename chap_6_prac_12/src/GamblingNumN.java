import java.util.Scanner;

class Person{
	protected String personName;
	
	public Person(String personName){
		this.personName = personName;
	}
	public String getName() {
		return personName;
	}
	
}
public class GamblingNumN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean TF = true;
		int n, a, b, c;
		int count = 0;
		
		System.out.print("겜블링 게임에 참여할 선수 숫자 >>");
		n = scan.nextInt();
		Person [] players = new Person[n];
		String [] playerName = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) +"번째 선수 이름>>");
			players[i] = new Person(scan.next());
			playerName[i] = players[i].getName();	
		}
		
		scan.nextLine();
		
		while(TF) {
			System.out.print("["+ playerName[count % n] + "]: <Enter>");
			scan.nextLine();
			a = (int)(Math.random()*3 + 1);
			b = (int)(Math.random()*3 + 1);
			c = (int)(Math.random()*3 + 1);
			
			System.out.print("\t" + a + "  " + b + "  " + c + "  ");
			
			if (a==b && b==c) {
				System.out.println(playerName[count % n] + "님이 이겼습니다!");
				scan.close();
				TF = false;
				break;
			}
			else {
				System.out.println("아쉽군요!");
				count++;
			}
		}
	}
}
