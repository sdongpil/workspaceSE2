package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class FlowLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayout frame = new FlowLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("first");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("second");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("third");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("four");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("five");
		contentPane.add(btnNewButton_3);
	}

}
