import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.print("(" + x + " , " + y + ")" + radius + "\n");
	}
	public double Area() {
		return 3.14*radius*radius;
	}
}


public class CircleManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle [] c = new Circle[3];
		for (int i=0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		int temp = 0;
		
		if(c[0].Area() > c[1].Area() && c[0].Area() > c[2].Area())
			temp = 0;
		else if(c[1].Area() > c[0].Area() && c[1].Area() > c[2].Area())
			temp = 1;
		else if(c[2].Area() > c[0].Area() && c[2].Area() > c[1].Area())
			temp = 2;
		
		System.out.print("가장 면적이 큰 원은 ");
		c[temp].show();
		
		scan.close();
	}
}