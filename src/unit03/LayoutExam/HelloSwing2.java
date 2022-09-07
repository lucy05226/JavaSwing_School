package unit03.LayoutExam;

import javax.swing.JFrame;

public class HelloSwing2 extends JFrame {

	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setTitle("집보내줘요ㅠㅠ");
		f.setLocation(500, 200); //창이 뜨는 위치
		f.setSize(350,100);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
