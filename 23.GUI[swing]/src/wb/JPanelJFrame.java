package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JPasswordField;

public class JPanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanelJFrame frame = new JPanelJFrame();
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
	public JPanelJFrame() {
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setTitle("개졸려");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel northpanel = new JPanel();
		northpanel.setBackground(Color.CYAN);
		contentPane.add(northpanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JPanelJFrame.class.getResource("/images/50bigle.png")));
		northpanel.add(lblNewLabel);
		
		textField = new JTextField();
		northpanel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		northpanel.add(btnNewButton);
		
		JPanel southpanel = new JPanel();
		southpanel.setBackground(Color.GREEN);
		contentPane.add(southpanel, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("회원가입");
		southpanel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("로그인");
		southpanel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("회원리스트");
		southpanel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("회원탈퇴");
		southpanel.add(btnNewButton_1);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.YELLOW);
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(68, 48, 57, 15);
		centerPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("패스워드");
		lblNewLabel_3.setBounds(68, 87, 57, 15);
		centerPanel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 45, 154, 21);
		centerPanel.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 84, 154, 21);
		centerPanel.add(passwordField);
		
		JButton btnNewButton_5 = new JButton("로그인");
		btnNewButton_5.setBounds(65, 137, 97, 23);
		centerPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("취소");
		btnNewButton_6.setBounds(202, 137, 97, 23);
		centerPanel.add(btnNewButton_6);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.MAGENTA);
		contentPane.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("회원리스트");
		westPanel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "이소라", "이효리", "신명숙", "김은희", "김봉화", "최경녀"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		westPanel.add(list, BorderLayout.CENTER);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.BLUE);
		contentPane.add(eastPanel, BorderLayout.EAST);
	}
}
