import javax.swing.*;

public class JavaFrame extends JFrame {
	public JavaFrame(){
		setTitle("Let's study Java");
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		JavaFrame f = new JavaFrame();
	}

}
