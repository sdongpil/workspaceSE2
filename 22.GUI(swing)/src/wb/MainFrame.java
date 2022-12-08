package wb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\2022-11-JAVA-DEVELOPER\\01.JAVA_FUNDMENTAL-master\\image\\w.png"));
		setTitle("나의첫번째프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 443);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setToolTipText("아이디를 입력하세요");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(Color.GRAY);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("패스워드");
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);

		JCheckBox chckbxNewCheckBox = new JCheckBox("아이디저장");
		contentPane.add(chckbxNewCheckBox);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "로그인방법", "카카오", "네이버", "구글" }));
		contentPane.add(comboBox);
	}

}
