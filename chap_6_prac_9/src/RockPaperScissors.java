import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] strarr = {"����", "����", "��"};
		boolean TF = true;
		int menu;
		
		while(TF) {
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
			menu = scan.nextInt();
			int n = (int)(Math.random()*3 + 1);
			if(menu == 4) {
				System.out.println("������ �����մϴ�.");
				scan.close();
				TF = false;
				break;
			}
			if(menu >=1 && menu <= 3)
			switch(menu - n) {
			case 0 : 
				System.out.println("ö��(" + strarr[menu-1] + ") : ��ǻ��(" + strarr[n-1] + ")");
				System.out.println("�����ϴ�.");
				break;
			case 1 :
			case -2 :
				System.out.println("ö��(" + strarr[menu-1] + ") : ��ǻ��(" + strarr[n-1] + ")");
				System.out.println("ö���� �̰���ϴ�.");
				break;
			case -1 :
			case 2 :
				System.out.println("ö��(" + strarr[menu-1] + ") : ��ǻ��(" + strarr[n-1] + ")");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				break;
				
			}
			
		}

	}

}
