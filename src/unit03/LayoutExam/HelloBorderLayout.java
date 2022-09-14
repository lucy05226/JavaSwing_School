package unit03.LayoutExam;

import java.awt.*;

import javax.swing.*;

public class HelloBorderLayout extends JFrame{
	HelloBorderLayout() {
	//패널 만들기, 프레임 위에 붙이기
	JPanel p = new JPanel();
	add(p);
	
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	JButton btn5 = new JButton("버튼5");
	
	p.setLayout(new BorderLayout());
	p.add(btn1, BorderLayout.NORTH);
	p.add(btn2, BorderLayout.CENTER);
	p.add(btn3, BorderLayout.SOUTH);
	p.add(btn4, BorderLayout.WEST);
	p.add(btn5, BorderLayout.EAST);
		
	//프레임 기본세팅
	setTitle("보더 레이아웃");
	setSize(350,200);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}

	public static void main(String[] args) {
		new HelloBorderLayout();

	}

}
