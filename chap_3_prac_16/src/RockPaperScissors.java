import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] game = {"가위", "바위", "보"};
		
		
		System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.\n");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scan.nextLine();
			int n = (int)(Math.random()*3);
			
			if((game[n].equals("가위") && user.equals("가위")) || (game[n].equals("바위") && user.equals("바위")) || (game[n].equals("보") && user.equals("보"))) {
				System.out.print("사용자 = " + user + " , 컴퓨터  = " + game[n] + " 비겼습니다. \n");
			}
			
			if((game[n].equals("가위") && user.equals("보")) || (game[n].equals("바위") && user.equals("가위")) || (game[n].equals("보") && user.equals("바위"))) {
				System.out.print("사용자 = " + user + " , 컴퓨터  = " + game[n] + " 컴퓨터가 이겼습니다. \n");
			}
			
			if((game[n].equals("가위") && user.equals("바위")) || (game[n].equals("바위") && user.equals("보")) || (game[n].equals("보") && user.equals("가위"))) {
				System.out.print("사용자 = " + user + " , 컴퓨터  = " + game[n] + " 사용자가 이겼습니다. \n");
			}
			
			if(user.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;
			}
			
		}
		
		scan.close();
	}

}
