
public class Rectangle {
	
	private int x, y;
	private int width;
	private int height;
	
	private Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	private int square() {
		return width*height;
	}
	
	private void show() {
		System.out.print("(" + x + "," + y + ") ���� ũ�Ⱑ " + width + "X" + height + "�� �簢��\n");
	}
	
	private boolean contains(Rectangle r) {
		
		if ((x <= r.x && width+x >= r.width+r.x) && (y <= r.y && height+y >= r.height+r.y))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.print("s�� ������" + s.square() + "\n");
		if(t.contains(r))
			System.out.print("t�� r�� �����մϴ�.\n");
		if(t.contains(s))
			System.out.print("t�� s�� �����մϴ�.\n");
		if(r.contains(t))
			System.out.print("r�� t�� �����մϴ�.\n");
	}

}
