class Point{
	private int x;
	private int y;
	
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
}
public class PositivePoint extends Point {
	
	public PositivePoint() {
	}
	public PositivePoint(int x, int y) {
		super(x, y);
		if(x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}
	@Override
	public void move(int x, int y) {
		if (x < 0 || y < 0) {
			x = getX();
			y = getY();
		}
		super.move(x, y);
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		
		p.move(10, 10);
		System.out.print(p.toString() + "입니다.\n");
		
		p.move(-5, 5);
		System.out.print(p.toString() + "입니다.\n");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.print(p2.toString() + "입니다. \n");

	}

}
