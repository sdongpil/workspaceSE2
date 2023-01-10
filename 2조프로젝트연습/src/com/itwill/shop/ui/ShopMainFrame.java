package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends JFrame {

	private JPanel contentPane;
	private UserService userService;
	private User user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public ShopMainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel globalSouthMenuPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) globalSouthMenuPanel.getLayout();
		flowLayout.setHgap(20);
		globalSouthMenuPanel.setBackground(Color.WHITE);
		contentPane.add(globalSouthMenuPanel, BorderLayout.SOUTH);
		
		JButton globalSearchMenuButton = new JButton("");
		globalSearchMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalSearchMenuButton.setBorder(null);
		globalSearchMenuButton.setOpaque(false);
		globalSearchMenuButton.setBackground(new Color(240, 240, 240));
//		globalSearchMenuButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_dog50.png")));
		globalSouthMenuPanel.add(globalSearchMenuButton);
		
		JButton globalHomeMenuButton = new JButton("");
		globalHomeMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalHomeMenuButton.setOpaque(false);
		globalHomeMenuButton.setBorder(null);
//		globalHomeMenuButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/user.png")));
		globalSouthMenuPanel.add(globalHomeMenuButton);
		
		JButton globalMemberMenuButton = new JButton("");
		globalMemberMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalMemberMenuButton.setOpaque(false);
		globalMemberMenuButton.setBorder(null);
//		globalMemberMenuButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/cart50.png")));
		globalSouthMenuPanel.add(globalMemberMenuButton);
		
		JTabbedPane shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, productTabbedPane, null);
		
		UpdatePanel updatePanel = new UpdatePanel();
		shopTabbedPane.addTab(" 회원수정", null, updatePanel, null);
		
		
		
		
		JTabbedPane memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", null, memberTabbedPane, null);
		
	 userService = new UserService();
	 user = new User("book!", null, null, null, null, null);
	}

}