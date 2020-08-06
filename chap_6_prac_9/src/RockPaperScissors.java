import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] strarr = {"가위", "바위", "보"};
		boolean TF = true;
		int menu;
		
		while(TF) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			menu = scan.nextInt();
			int n = (int)(Math.random()*3 + 1);
			if(menu == 4) {
				System.out.println("게임을 종료합니다.");
				scan.close();
				TF = false;
				break;
			}
			if(menu >=1 && menu <= 3)
			switch(menu - n) {
			case 0 : 
				System.out.println("철수(" + strarr[menu-1] + ") : 컴퓨터(" + strarr[n-1] + ")");
				System.out.println("비겼습니다.");
				break;
			case 1 :
			case -2 :
				System.out.println("철수(" + strarr[menu-1] + ") : 컴퓨터(" + strarr[n-1] + ")");
				System.out.println("철수가 이겼습니다.");
				break;
			case -1 :
			case 2 :
				System.out.println("철수(" + strarr[menu-1] + ") : 컴퓨터(" + strarr[n-1] + ")");
				System.out.println("컴퓨터가 이겼습니다.");
				break;
				
			}
			
		}

	}

}
