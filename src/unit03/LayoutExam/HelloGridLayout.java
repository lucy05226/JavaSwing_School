package unit03.LayoutExam;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGridLayout extends JFrame{
	public HelloGridLayout() {
		
		
		//���� ����
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		add(p);
		
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		JButton b3 = new JButton("��ư3");
		JButton b4 = new JButton("��ư4");
		JButton b5 = new JButton("��ư5");
		JButton b6 = new JButton("��ư6");
		JButton b7 = new JButton("��ư7");
		
		b1.setBackground(Color.green);
		b2.setBackground(Color.green);
		b3.setBackground(Color.green);
		b4.setBackground(Color.green);
		b5.setBackground(Color.green);
		b6.setBackground(Color.green);
		b7.setBackground(Color.green);
		
		p.setLayout(new GridLayout(0, 2));
		p.add(b1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		
		setTitle("Hello GridLayOut");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new HelloGridLayout();
	}

}
