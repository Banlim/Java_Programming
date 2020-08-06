import java.util.Scanner;


public class SubjectScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int [] score = {95, 88, 76, 62, 55};
		boolean trueOrfalse;
		
		while(true) {
			System.out.print("과목 이름>>");
			String name = scan.next();
			
			trueOrfalse = true;
			for(int i = 0; i < 5; i++) {
				if (course[i].equals(name)) {
					int n = score[i];
					System.out.print(course[i] + "의 점수는 " + n + "\n");
					trueOrfalse = false;
				}
				
			}
			if(name.equals("그만"))
				break;
			
			if(trueOrfalse)
				System.out.print("없는 과목입니다.");
			
				
			}
	
		scan.close();
	}
}


