package unit03.LayoutExam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class LayoutTest2 extends JFrame{
	LayoutTest2(){
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		add(p1, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0,2));
		add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		add(p3, BorderLayout.SOUTH);
		
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		JButton b3 = new JButton("��ư3");
		JButton b4 = new JButton("��ư4");
		JButton b5 = new JButton("��ư5");
		JButton b6 = new JButton("��ư6");
		
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		p3.add(b5);
		p3.add(b6);
		
		
		
		
		
		setTitle("���̾ƿ� ����");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LayoutTest2();

	}

}