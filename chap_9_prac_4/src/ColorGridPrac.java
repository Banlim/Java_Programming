import javax.swing.*;
import java.awt.*;

public class ColorGridPrac extends JFrame{
	public ColorGridPrac() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		GridLayout grid = new GridLayout(1,10,2,5);
		Container c = getContentPane();
		
		c.setLayout(grid);
		JButton btn1 = new JButton("0");
		JButton btn2 = new JButton("1");
		JButton btn3 = new JButton("2");
		JButton btn4 = new JButton("3");
		JButton btn5 = new JButton("4");
		JButton btn6 = new JButton("5");
		JButton btn7 = new JButton("6");
		JButton btn8 = new JButton("7");
		JButton btn9 = new JButton("8");
		JButton btn10 = new JButton("9");
		btn1.setBackground(Color.RED);
		btn2.setBackground(Color.ORANGE);
		btn3.setBackground(Color.YELLOW);
		btn4.setBackground(Color.green);
		btn5.setBackground(Color.cyan);
		btn6.setBackground(Color.BLUE);
		btn7.setBackground(Color.MAGENTA);
		btn8.setBackground(Color.GRAY);
		btn9.setBackground(Color.pink);
		btn10.setBackground(Color.LIGHT_GRAY);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		c.add(btn7);
		c.add(btn8);
		c.add(btn9);
		c.add(btn10);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorGridPrac();

	}

}
