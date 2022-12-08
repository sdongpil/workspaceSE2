package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/*
 * ActionEvent 를 처리하기위한 핸들러는 반드시 ACtionLIstener 인터페이스를 구현해야한다 
 */

public class NorthBtnActionEventHandler implements ActionListener{
int click = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("실행쓰레드이름:"+Thread.currentThread());
		System.out.println("이벤트소스:"+e.getSource());
		
		/*
		 * 이벤트 소스 객체변경
		 */
		JButton source = (JButton)e.getSource();
		click++;
		source.setText("이벤트 소스 north click");
		
		source.setBackground(Color.RED);
		source.setForeground(Color.yellow);
		
		System.out.println("north button click!!!"+click);
		
	}

	/*
	 * 프레임의 타이틀변경
	 * contentPane(프레임의 멤버필드)의 배경색변경
	 * 
	 */
	

}
