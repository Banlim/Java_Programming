import javax.swing.*;
import java.awt.*;

public class NWSEframe extends JFrame {
	public NWSEframe() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));
		
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NWSEframe();

	}

}
