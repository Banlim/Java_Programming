import java.util.Scanner;

public class IsTriangle {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("정수 3개 입력하시오 >> ");
	
	int int1 = scanner.nextInt();
	int int2 = scanner.nextInt();
	int int3 = scanner.nextInt();
	
	if((int1+int2) < int3 || (int1+int3) < int2 || (int2+int3) < int1)
		System.out.print("삼각형을 만들 수 없습니다. \n");
	else
		System.out.print("삼각형을 만들 수 있습니다.");
	
	scanner.close();

	}

}
