package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionEventJFrameWB extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionEventJFrameWB frame = new ActionEventJFrameWB();
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
	public ActionEventJFrameWB() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("초기화!!!");
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton northBtn = new JButton("이벤트소스[NORTH]");
		northBtn.addActionListener(new ActionListener() {
			int count;
			public void actionPerformed(ActionEvent e) {
				/************로그인 버튼 클릭*********************/
				setTitle("north button click["+ ++count +"]");
				int r = (int)(Math.random()*256);
				int g= (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				contentPane.setBackground(new Color(r,g,b));
				
			}
		});
		contentPane.add(northBtn, BorderLayout.NORTH);
		JButton westBtn = new JButton("이벤트소스[WEST]");
		westBtn.addActionListener(new ActionListener() {
			int count;
			public void actionPerformed(ActionEvent e) {
				/************회원가입 버튼 클릭*********************/
				setTitle("north button click["+ ++count +"]");
				int r = (int)(Math.random()*256);
				int g= (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				contentPane.setBackground(new Color(r,g,b));
				
			}
		});
		contentPane.add(westBtn, BorderLayout.WEST);
		
		JButton eastBtn = new JButton("이벤트소스[EAST]");
		contentPane.add(eastBtn, BorderLayout.EAST);
		
		JButton southBtn = new JButton("이벤트소스[SOUTH]");
		contentPane.add(southBtn, BorderLayout.SOUTH);
	}

}
