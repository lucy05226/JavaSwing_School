package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	public HelloPanel() {
		JPanel p = new JPanel();
		p.setBackground(Color.orange);
		add(p);
		
		JButton jb1 = new JButton("��ư1");
		jb1.setBackground(Color.yellow);
		p.add(jb1);
		
		JButton jb2 = new JButton("��ư2");
		jb2.setBackground(Color.pink);
		p.add(jb2);
		
		
		setTitle("�ȳ� �г�");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
		
	
	

	public static void main(String[] args) {
		new HelloPanel();

	}

}
