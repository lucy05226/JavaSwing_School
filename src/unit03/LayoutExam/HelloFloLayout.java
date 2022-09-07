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
		
		JButton jb1 = new JButton("��ư1");
		jb1.setBackground(Color.red);
		p.add(jb1);
		
		JButton jb2 = new JButton("��ư2");
		jb2.setBackground(Color.orange);
		p.add(jb2);
		
		JButton jb3 = new JButton("��ư3");
		jb3.setBackground(Color.yellow);
		p.add(jb3);
		
		JButton jb4 = new JButton("��ư4");
		jb4.setBackground(Color.green);
		p.add(jb4);
		
		JButton jb5 = new JButton("��ư5");
		jb5.setBackground(Color.blue);
		p.add(jb5);
		
		JButton jb6 = new JButton("��ư6");
		jb6.setBackground(Color.DARK_GRAY);
		p.add(jb6);
		
		JButton jb7 = new JButton("��ư7");
		jb7.setBackground(Color.black);
		p.add(jb7);
		
		setTitle("�ȳ� �÷ο췹�̾ƿ�");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloFloLayout();
		

	}

}
