import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {
		next = null;
	}
	public void setNext(Shape obj){
		next = obj;
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw();
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class GraphicEditor {
	static Shape start = null, end = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 4) {
			int shapeType, index;
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			menu = scan.nextInt();
			switch(menu) {
			case 1 :
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				shapeType = scan.nextInt();
				if(shapeType < 1 || shapeType > 3) {
					System.out.println("잘못된 선택입니다.");
					break;
				}
				insert(shapeType);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>>");
				index = scan.nextInt();
				if(!delete(index))
					System.out.print("삭제할 수 없습니다.\n");
				break;
			case 3:
				Shape p = start;
				while(p != null) {
					p.draw();
					p = p.getNext();
				}
				break;
			case 4:
				System.out.print("beauty를 종료합니다.");
				scan.close();
				break;
			}
		}
			
	}
	private static void insert(int shapeType) {
		Shape obj=null;
		switch (shapeType) {
			case 1: 
				 obj = new Line();
				 break;
			case 2: 
				obj = new Rect();
				break;
			case 3: 
				obj = new Circle();
		}
		if (start == null) { 
			start = end = obj;
		} else {
			end.setNext(obj); 
			end = obj;
		}
	}
	private static boolean delete(int index) {
		Shape current = start, previous = start;
		if(current == null)
			return false;
		for(int i = 0; i < index; i++) {
			previous = current;
			current = current.getNext();
			if(current == null)
				return false;
		}
		if(start == end) {
			start = end = null;
			return true;
		}
		if(current == start) {
			start = start.getNext();
			return true;
		}
		else if(current == end) {
			end = previous;
			end.setNext(null);
		}
		else
			previous.setNext(current.getNext());
		
		return true;
	}

}
