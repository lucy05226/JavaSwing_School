package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloFloLayout extends JFrame{
	public HelloFloLayout() {
		JPanel p = new JPanel();
		p.setBackground(Color.gray);
		add(p);
		
		JButton jb1 = new JButton("버튼1");
		jb1.setBackground(Color.red);
		p.add(jb1);
		
		JButton jb2 = new JButton("버튼2");
		jb2.setBackground(Color.orange);
		p.add(jb2);
		
		JButton jb3 = new JButton("버튼3");
		jb3.setBackground(Color.yellow);
		p.add(jb3);
		
		JButton jb4 = new JButton("버튼4");
		jb4.setBackground(Color.green);
		p.add(jb4);
		
		JButton jb5 = new JButton("버튼5");
		jb5.setBackground(Color.blue);
		p.add(jb5);
		
		JButton jb6 = new JButton("버튼6");
		jb6.setBackground(Color.DARK_GRAY);
		p.add(jb6);
		
		JButton jb7 = new JButton("버튼7");
		jb7.setBackground(Color.black);
		p.add(jb7);
		
		setTitle("안녕 플로우레이아웃");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloFloLayout();
		

	}

}
