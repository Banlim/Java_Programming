import java.util.Scanner;

public class ThreeMultiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		
		int [] pinteger = new int[10];
		
		for (int i = 0; i < pinteger.length; i++)
			pinteger[i] = scan.nextInt();
		
		System.out.print("3의 배수는 ");
		for (int j = 0; j < pinteger.length; j++) {
			if(pinteger[j]%3 == 0)
				System.out.print(pinteger[j] + " ");
		}
		
		scan.close();
		
	}

}
