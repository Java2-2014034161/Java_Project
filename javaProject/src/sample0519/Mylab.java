package sample0519;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//Ctrl+Shift+O

public class Mylab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
  
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
  		f.setSize(300, 150);		//프레임크기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//close 버튼 누르면 전체 프로그램 종료
		f.setTitle("온도변환기");
		f.setVisible(true);		//프레임을 화면에 나타나게 만든다

	}

}
