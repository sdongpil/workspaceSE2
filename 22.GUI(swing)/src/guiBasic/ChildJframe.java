package guiBasic;
/* GUI프로그래밍 방법
*   1.  컨테이너클래스준비(JFrame)상속
*   2.  컨테이너클래스(JFrame)객체생성
*   3.  컨테이너(JFrame)객체의 크기설정
*   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
*   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
*   6.  컨테이너객체 보여주기
*/

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChildJframe extends JFrame {

	private JPanel contentPane;
	private JButton okBtn;
	private JButton cancleBtn;

	public ChildJframe() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("z");
		this.contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		this.setContentPane(contentPane);

		/*
		 * 컨테이너에 컴포넌트를 붙인다.
		 */
		okBtn = new JButton("확인");
		cancleBtn = new JButton("취소");

		contentPane.setLayout(null);
		okBtn.setBounds(40, 40, 80, 40);
		cancleBtn.setBounds(130, 40, 80, 40);

		contentPane.add(okBtn);
		contentPane.add(cancleBtn);

		this.setSize(300, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ChildJframe();
	}

}
