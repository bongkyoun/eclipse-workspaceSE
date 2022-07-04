package com.itwill.member.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.itwill.member.dto.Member;
import com.itwill.member.service.MemberService;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class MemberMainFrame extends JFrame {
	/*******1.MemberSevice 객체선언*****/
	private MemberService memberService;
	/*
	ex : private ProductService memberService;
	.....등
	*/
	/************************************/
	
	/**********로그인한회원**********/
	private Member loginMember=null;
	/*********************************/
	
	private JPanel contentPane;
	private JTabbedPane memberTabbedPane;
	private JTextField idTF;
	private JPasswordField passwordTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JLabel messageLB;
	private JComboBox ageCB;
	private JCheckBox marriedCHK;
	private JTextField loginIdTF;
	private JPasswordField loginPasswordTF;
	private JLabel loginMessageLB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
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
	public MemberMainFrame() {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel joinPanel = new JPanel();
		memberTabbedPane.addTab("회원가입", null, joinPanel, null);
		joinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(33, 44, 57, 15);
		joinPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패쓰워드");
		lblNewLabel_1.setBounds(33, 101, 57, 15);
		joinPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(33, 163, 57, 15);
		joinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(33, 224, 57, 15);
		joinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(33, 278, 57, 15);
		joinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼");
		lblNewLabel_5.setBounds(33, 331, 57, 15);
		joinPanel.add(lblNewLabel_5);
		
		idTF = new JTextField();
		idTF.setBounds(126, 41, 116, 21);
		joinPanel.add(idTF);
		idTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(126, 98, 116, 21);
		joinPanel.add(passwordTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(126, 160, 116, 21);
		joinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(126, 221, 116, 21);
		joinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45"}));
		ageCB.setBounds(125, 274, 117, 23);
		joinPanel.add(ageCB);
		
		marriedCHK = new JCheckBox("");
		marriedCHK.setBounds(126, 327, 115, 23);
		joinPanel.add(marriedCHK);
		
		JButton joinBtn = new JButton("가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/********회원가입*************/
				try {
					//TextField로부터데이타얻기
					String id=idTF.getText();
					String password=passwordTF.getText();
					String name=nameTF.getText();
					String address=addressTF.getText();
					
					if(id.equals("")|| password.equals("")||name.equals("")|| address.equals("")) {
						messageLB.setText("* 내용을 입력하세요");
						return;
					}
					String ageStr=(String)ageCB.getSelectedItem();
					int age=Integer.parseInt(ageStr);
					String marriedStr="";
					if(marriedCHK.isSelected()) {
						marriedStr="T";
					}else {
						marriedStr="F";
					}
					Member newMember=new Member(id, password, name, address, age, marriedStr, null);
					System.out.println("1.MemberMainFrame ");
					boolean isSuccess=
							memberService.addMember(newMember);
					if(isSuccess) {
						//성공(로그인패널을 보여준다.)
						memberTabbedPane.setSelectedIndex(1);
					}else {
						//실패(다이알로그를 뛰운다.)
						JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
						
						
					}
					
					
				} catch (Exception e1) {
						
				}
				/******************************/
			}
		});
		joinBtn.setBounds(33, 404, 97, 23);
		joinPanel.add(joinBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setBounds(160, 404, 97, 23);
		joinPanel.add(cancleBtn);
		
		messageLB = new JLabel("");
		messageLB.setForeground(Color.RED);
		messageLB.setBounds(126, 72, 175, 15);
		joinPanel.add(messageLB);
		
		JLabel lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(255, 44, 15, 15);
		joinPanel.add(lblNewLabel_6);
		
		JPanel loginPanel = new JPanel();
		memberTabbedPane.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setBounds(18, 85, 57, 15);
		loginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("패쓰워드");
		lblNewLabel_8.setBounds(18, 150, 57, 15);
		loginPanel.add(lblNewLabel_8);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(138, 82, 116, 21);
		loginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPasswordTF = new JPasswordField();
		loginPasswordTF.setBounds(138, 147, 116, 21);
		loginPanel.add(loginPasswordTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*************회원로그인**************/
				try {
					String id=loginIdTF.getText();
					String password=loginPasswordTF.getText();
					
					int result=
							memberService.login(id, password);
					if(result==0) {
						loginProcess(id);
					}else if(result==1) {
						//실패 아이디존재안함
						loginMessageLB.setText("아이디존재안함");
						loginIdTF.requestFocus();
						
					}else if(result==2) {
						loginMessageLB.setText("패쓰워드 불일치");
						//실패 패쓰워드불일치
						loginPasswordTF.requestFocus();
					}
					
				}catch (Exception e1) {
					// TODO: handle exception
				}	
				/***********************************/
			}
		});
		loginBtn.setBounds(18, 233, 97, 23);
		loginPanel.add(loginBtn);
		
		JButton cancleBtn2 = new JButton("취소");
		cancleBtn2.setBounds(169, 233, 97, 23);
		loginPanel.add(cancleBtn2);
		
		loginMessageLB = new JLabel("");
		loginMessageLB.setBounds(18, 196, 252, 15);
		loginPanel.add(loginMessageLB);
		
		JPanel listPanel = new JPanel();
		memberTabbedPane.addTab("회원리스트", null, listPanel, null);
		
		/********2.MemberService객체생성**********/
		memberService=new MemberService();
		//productService=new ProductService();
		/*****************************************/
		
	}//생성자끝
	/*******************로그인성공시호출할메쏘드******************/
	public void loginProcess(String id)throws Exception {
		/*
		 * 1.로그인멤버객체 저장
		 * 2.MemberMainFrame타이틀변경
		 * 3.로그인,회원가입 tab 불활성화
		 * 4.로그아웃메뉴아이템 활성화
		 * 5.회원리스트탭 활성화
		 */
		Member loginSuccessMember=memberService.findById(id);
		loginMember = loginSuccessMember;
		setTitle(loginMember.getM_name());
		memberTabbedPane.setSelectedIndex(2);
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
	}
	/*******************로그아웃시호출할메쏘드******************/
	public void logoutProcess() {
		/*
		 * 1.로그인멤버객체 삭제
		 * 2.MemberMainFrame타이틀변경
		 * 3.로그인,회원가입 tab 활성화
		 * 4.로그아웃메뉴아이템 불활성화
		 * 5.회원리스트탭 불활성화
		 */
	}
}//클래스끝
