
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
		System.out.print("(" + x + "," + y + ") 에서 크기가 " + width + "X" + height + "인 사각형\n");
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
		System.out.print("s의 면적은" + s.square() + "\n");
		if(t.contains(r))
			System.out.print("t는 r를 포함합니다.\n");
		if(t.contains(s))
			System.out.print("t는 s를 포함합니다.\n");
		if(r.contains(t))
			System.out.print("r은 t를 포함합니다.\n");
	}

}
