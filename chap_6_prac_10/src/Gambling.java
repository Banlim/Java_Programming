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
public class Gambling {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean TF = true;
		int a, b, c;
		int count = 0;
		
		System.out.print("1번째 선수 이름>>");
		Person player1 = new Person(scan.nextLine());
		System.out.print("2번째 선수 이름>>");
		Person player2 = new Person(scan.nextLine());
		
		String [] players = new String[2];
		players[0] = player1.getName();
		players[1] = player2.getName();
		
		while(TF) {
			System.out.print("["+ players[count % 2] + "]: <Enter>");
			scan.nextLine();
			a = (int)(Math.random()*3 + 1);
			b = (int)(Math.random()*3 + 1);
			c = (int)(Math.random()*3 + 1);
			
			System.out.print("\t" + a + "  " + b + "  " + c + "  ");
			
			if (a==b && b==c) {
				System.out.println(players[count % 2] + "님이 이겼습니다!");
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
