import java.util.Scanner;
class Dictionary{
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future","hope"};
	
	public static String kor2Eng(String word) {
		int temp = -1;
		for (int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word))
				temp = i;
		}
		if(temp == -1)
			return "zero";
		
		return eng[temp];
	}
	
}

public class DicApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("한영 단어 검색 프로그램 입니다.\n");
		
		while(true) {
			System.out.print("한글 단어?");
			String word = scan.next();
			
			if (word.equals("그만"))
				break;
			if(Dictionary.kor2Eng(word).equals("zero"))
				System.out.print(word + "는 사전에 없습니다.\n");
			else
				System.out.print(word + "는 " + Dictionary.kor2Eng(word) + "\n");
		}
		
		scan.close();
	}
}
