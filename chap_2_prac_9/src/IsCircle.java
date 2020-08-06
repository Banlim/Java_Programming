import java.util.Scanner;

public class IsCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double center1 = scan.nextDouble();
		double center2 = scan.nextDouble();
		double r = scan.nextDouble();
		
		System.out.print("점 입력>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		double distance = Math.sqrt((center1 - x)*(center1 - x) + (center2 - y)*(center2 - y));
				
		if(distance <= r)
			System.out.print("점 (" + x + "," + y + ")는 원 안에 있다.");
		else
			System.out.print("점 (" + x + "," + y + ")는 원 안에 없다.");
		
		scan.close();
		

	}

}
