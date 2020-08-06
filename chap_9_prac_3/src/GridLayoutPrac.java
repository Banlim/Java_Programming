import javax.swing.*;
import java.awt.*;

public class GridLayoutPrac extends JFrame {
	
	public GridLayoutPrac() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		GridLayout grid = new GridLayout(1,10,2,5);
		Container c = getContentPane();
		
		c.setLayout(grid);
		c.add(new JButton("0"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutPrac();

	}

}