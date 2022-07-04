package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChattingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingJFrame frame = new ChattingJFrame();
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
	public ChattingJFrame() {
		setTitle("돛단배");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("봉균 : 설정 어케함?");
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("랜덤채팅");
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("전송");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(23);
		panel.add(btnNewButton);
	}

}
