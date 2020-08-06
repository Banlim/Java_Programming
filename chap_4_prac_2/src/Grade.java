import java.util.Scanner;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int average(){
		int sum = this.math + this.science + this.english;
		int average = sum/3;
		return average;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.print("평균은 " + me.average());
		
		scan.close();
	}

}
