import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] game = {"����", "����", "��"};
		
		
		System.out.print("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.\n");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			String user = scan.nextLine();
			int n = (int)(Math.random()*3);
			
			if((game[n].equals("����") && user.equals("����")) || (game[n].equals("����") && user.equals("����")) || (game[n].equals("��") && user.equals("��"))) {
				System.out.print("����� = " + user + " , ��ǻ��  = " + game[n] + " �����ϴ�. \n");
			}
			
			if((game[n].equals("����") && user.equals("��")) || (game[n].equals("����") && user.equals("����")) || (game[n].equals("��") && user.equals("����"))) {
				System.out.print("����� = " + user + " , ��ǻ��  = " + game[n] + " ��ǻ�Ͱ� �̰���ϴ�. \n");
			}
			
			if((game[n].equals("����") && user.equals("����")) || (game[n].equals("����") && user.equals("��")) || (game[n].equals("��") && user.equals("����"))) {
				System.out.print("����� = " + user + " , ��ǻ��  = " + game[n] + " ����ڰ� �̰���ϴ�. \n");
			}
			
			if(user.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break;
			}
			
		}
		
		scan.close();
	}

}
