import java.util.Scanner;


public class SubjectScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] course = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int [] score = {95, 88, 76, 62, 55};
		boolean trueOrfalse;
		
		while(true) {
			System.out.print("���� �̸�>>");
			String name = scan.next();
			
			trueOrfalse = true;
			for(int i = 0; i < 5; i++) {
				if (course[i].equals(name)) {
					int n = score[i];
					System.out.print(course[i] + "�� ������ " + n + "\n");
					trueOrfalse = false;
				}
				
			}
			if(name.equals("�׸�"))
				break;
			
			if(trueOrfalse)
				System.out.print("���� �����Դϴ�.");
			
				
			}
	
		scan.close();
	}
}


