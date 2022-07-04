package com.itwill.member.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
	
	/***********로그인한 회원************/
	private Member loginMember = null;
	/************************************/
	
	
	private JPanel contentPane;
	private JTabbedPane memberTabbedPane;
	private JTextField idTF;
	private JTextField passwordTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JLabel messageLB;
	private JComboBox ageCB;
	private JCheckBox marriedCHK;
	private JTextField loginidTF;
	private JTextField loginPasswordTF;
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
		setBounds(100, 100, 366, 559);
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
		lblNewLabel.setBounds(35, 50, 57, 15);
		joinPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(35, 104, 57, 15);
		joinPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(35, 139, 57, 15);
		joinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(35, 176, 57, 15);
		joinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(35, 214, 57, 15);
		joinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼");
		lblNewLabel_5.setBounds(35, 247, 57, 15);
		joinPanel.add(lblNewLabel_5);
		
		idTF = new JTextField();
		idTF.setBounds(123, 47, 116, 21);
		joinPanel.add(idTF);
		idTF.setColumns(10);
		
		passwordTF = new JTextField();
		passwordTF.setBounds(123, 101, 116, 21);
		joinPanel.add(passwordTF);
		passwordTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setBounds(123, 136, 116, 21);
		joinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(123, 173, 116, 21);
		joinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56"}));
		ageCB.setBounds(123, 210, 116, 23);
		joinPanel.add(ageCB);
		
		marriedCHK = new JCheckBox("");
		marriedCHK.setBounds(124, 250, 115, 23);
		joinPanel.add(marriedCHK);
		
		JButton joinBtn = new JButton("가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/************회원가입***************/
			
			try {
				//TextField로 부터 데이터 얻기
				String id = idTF.getText();
				String password = passwordTF.getText();
				String name = nameTF.getText();
				String address = addressTF.getText();
				
				if(id.equals("")|| password.equals("")||name.equals("")|| address.equals("")) {
					messageLB.setText("* 내용을 입력하세요");
					return;
				}
				String ageStr = (String)ageCB.getSelectedItem();
				int age = Integer.parseInt(ageStr);
				String marriedStr = "";
				if (marriedCHK.isSelected()) {
					marriedStr = "T";
		}else {
					marriedStr = "F";
		}
				Member newMember = new Member(id, password, name, address, age, marriedStr, null);
				System.out.println("1. MemberMainFrame");
				boolean isSuccess = 
						memberService.addMember(newMember);
				memberService.addMember(newMember);
			if(isSuccess) {
					//로그인 성공한 객체 멤버변수 저장
				Member loginSuccessMember= memberService.findById(id);
				loginMember = loginSuccessMember;
				//프레임타이틀 설정
				setTitle(loginMember.getM_name());
				//성공 회원리스트 패널
				memberTabbedPane.setSelectedIndex(2);
				memberTabbedPane.setEnabledAt(0, false);
				memberTabbedPane.setEnabledAt(1, false);
			}else {
				//실패
				JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다람쥐");
				idTF.requestFocus();
				idTF.setSelectionStart(0);
				idTF.setSelectionEnd(id.length());
			}
			
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			/***********************************/
			}
		});
		joinBtn.setBounds(35, 327, 97, 23);
		joinPanel.add(joinBtn);
		
		JButton cancleBtn = new JButton("안할래용");
		cancleBtn.setBounds(144, 327, 97, 23);
		joinPanel.add(cancleBtn);
		
		messageLB = new JLabel("");
		messageLB.setForeground(Color.RED);
		messageLB.setBounds(35, 75, 204, 15);
		joinPanel.add(messageLB);
		
		JLabel lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(244, 50, 57, 15);
		joinPanel.add(lblNewLabel_6);
		
		JPanel loginPanel = new JPanel();
		memberTabbedPane.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setBounds(22, 77, 57, 15);
		loginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("패스워드");
		lblNewLabel_8.setBounds(22, 187, 57, 15);
		loginPanel.add(lblNewLabel_8);
		
		loginidTF = new JTextField();
		loginidTF.setBounds(168, 74, 116, 21);
		loginPanel.add(loginidTF);
		loginidTF.setColumns(10);
		
		loginPasswordTF = new JTextField();
		loginPasswordTF.setBounds(168, 184, 116, 21);
		loginPanel.add(loginPasswordTF);
		loginPasswordTF.setColumns(10);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*************회원로그인******************/
			try {
				String id = loginidTF.getText();
				String password = loginPasswordTF.getText();
				
				int result = 
				memberService.login(id, password);
				if(result==0) {
			
				}else if(result == 1) {
					//실패 아이디 존재 안함
					loginMessageLB.setText("아이디 존재 안함");
					loginidTF.requestFocus();
				}else if(result == 2) {
					//실패 패스워드 불일치
					loginMessageLB.setText("패스워드 불일치");
					loginPasswordTF.requestFocus();
				}
				
			}catch (Exception e1) {
				
			}
			/****************************************/
			}
		});
		loginBtn.setBounds(22, 282, 97, 23);
		loginPanel.add(loginBtn);
		
		JButton cancelBtn2 = new JButton("취소");
		cancelBtn2.setBounds(168, 282, 97, 23);
		loginPanel.add(cancelBtn2);
		
		loginMessageLB = new JLabel("아이디 존재 안함");
		loginMessageLB.setForeground(Color.RED);
		loginMessageLB.setBounds(22, 237, 262, 15);
		loginPanel.add(loginMessageLB);
		
		JPanel listPanel = new JPanel();
		memberTabbedPane.addTab("회원리스트", null, listPanel, null);
	
		/*****2. memberService 객체 생성********/
		memberService = new MemberService();
		/*ex : productService = new ProductService();
		....등
		***************************************/
	}//생성자 끝
	/********************로그인성공 시 호출할 메쏘드*************/
	public void loginProcess() {
		//성공 회원리스트 패널 보여줌
		//loginMessageLB.setText("성공");
		Member loginSuccessMember = memberService.findById(id);
		loginmember = loginSuccessMember;
		
	}
	/********************로그아웃 시 호출할 메쏘드*************/
	public void logoutProcess() {
		
	}
}//클래스 끝
