import java.util.Scanner;

public class ModifyString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean TF = true;
		System.out.print(">>");
		String str = scan.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		while(TF) {
			System.out.print("명령 : ");
			String command = scan.nextLine();
			if(command.equals("그만")) {
				System.out.println("종료합니다.");
				scan.close();
				TF = false;
				break;
			}
			String [] token = command.split("!");
			int index = sb.indexOf(token[0]);
			if(token.length != 2) {
				System.out.println("잘못된 명령입니다.");
			}
			else {
				if(token[0].length() == 0 || token[1].length() == 0) {
					System.out.println("잘못된 명령입니다.");
					continue;
				}
				
				if(index == -1) {
				System.out.println("찾을 수 없습니다!");
				continue;
				}
				sb.replace(index, index+token[0].length(), token[1]);
				System.out.println(sb.toString());
			}
			
		}
	}

}
