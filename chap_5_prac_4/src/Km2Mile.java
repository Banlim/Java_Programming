import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.\n");
		System.out.print(getSrcString() + "�� �Է��ϼ���.>>");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.print("��ȯ ��� : " + res + getDestString() + "�Դϴ�.\n");
		scan.close();
	}
}

public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	
	
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); 
		toMile.run();
	
	}

}
