import java.util.Scanner;
class Dictionary{
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
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
		
		System.out.print("�ѿ� �ܾ� �˻� ���α׷� �Դϴ�.\n");
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = scan.next();
			
			if (word.equals("�׸�"))
				break;
			if(Dictionary.kor2Eng(word).equals("zero"))
				System.out.print(word + "�� ������ �����ϴ�.\n");
			else
				System.out.print(word + "�� " + Dictionary.kor2Eng(word) + "\n");
		}
		
		scan.close();
	}
}
