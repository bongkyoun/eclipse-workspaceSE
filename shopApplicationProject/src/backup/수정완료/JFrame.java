package backup.수정완료;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;




// 사이즈 setBounds(100, 100, 390, 844);  
// Jpanel 로 만들어주세요

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
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
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 680);
		
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBounds(new Rectangle(100, 0, 0, 0));
		menuBar.setSize(new Dimension(100, 0));
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		setJMenuBar(menuBar);
		
		
		JMenu cartMenu = new JMenu("");
		cartMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		cartMenu.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\cart.png"));
		menuBar.add(cartMenu);
		
		JMenuItem nothing1 = new JMenuItem("");
		nothing1.setEnabled(false);
		menuBar.add(nothing1);
		
		JMenu titleMenu = new JMenu("Market Coli");
		titleMenu.setForeground(new Color(128, 0, 128));
		titleMenu.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		titleMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(titleMenu);
		menuBar.setSize(300, 20);
		
		JMenuItem nothing2 = new JMenuItem("");
		nothing2.setEnabled(false);
		menuBar.add(nothing2);
		
		JMenu userMenu = new JMenu("");
		userMenu.setHorizontalAlignment(SwingConstants.CENTER);
		userMenu.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\door.png"));
		menuBar.add(userMenu);
		
		JMenuItem joinMenuItem = new JMenuItem("회원가입");
		userMenu.add(joinMenuItem);
		
		JMenuItem loginMenuItem = new JMenuItem("로그인");
		userMenu.add(loginMenuItem);
		
		JMenuItem mypageMenuItem_4 = new JMenuItem("마이페이지");
		userMenu.add(mypageMenuItem_4);
		
		JMenuItem logoutMenuItem_5 = new JMenuItem("로그아웃");
		userMenu.add(logoutMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(mainTabbedPane);
		
		JPanel productPanel = new JPanel();
		mainTabbedPane.addTab("상품", null, productPanel, null);
		productPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		productPanel.add(productTabbedPane, BorderLayout.CENTER);
		
		JPanel productMainPanel = new JPanel();
		productTabbedPane.addTab("상품전체보기", null, productMainPanel, null);
		productMainPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane productMainScrollPane = new JScrollPane();
		productMainPanel.add(productMainScrollPane, BorderLayout.CENTER);
		
		JPanel productPriceLabel = new JPanel();
		productPriceLabel.setPreferredSize(new Dimension(10, 800));
		productMainScrollPane.setViewportView(productPriceLabel);
		productPriceLabel.setLayout(null);
		
		JPanel productItemPanel = new JPanel();
		productItemPanel.setBackground(new Color(230, 230, 250));
		productItemPanel.setBounds(12, 10, 311, 156);
		productPriceLabel.add(productItemPanel);
		productItemPanel.setLayout(null);
		
		JLabel productImageLabel = new JLabel("");
		productImageLabel.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\과일\\석류135.jpg"));
		productImageLabel.setBounds(12, 10, 135, 135);
		productItemPanel.add(productImageLabel);
		
		JLabel productNameLabel = new JLabel("상품명");
		productNameLabel.setBounds(159, 21, 140, 15);
		productItemPanel.add(productNameLabel);
		
		JLabel lblNewLabel = new JLabel("상품가격");
		lblNewLabel.setBounds(159, 46, 140, 15);
		productItemPanel.add(lblNewLabel);
		
		JLabel producExpLabel = new JLabel("상품설명");
		producExpLabel.setBounds(159, 65, 140, 51);
		productItemPanel.add(producExpLabel);
		
		JComboBox productComboBox = new JComboBox();
		productComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		productComboBox.setBounds(227, 120, 39, 25);
		productItemPanel.add(productComboBox);

		JButton productCartBtn = new JButton("");
		productCartBtn.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\cart.png"));
		productCartBtn.setBounds(267, 120, 32, 25);
		productItemPanel.add(productCartBtn);
		
		JPanel productServePanel = new JPanel();
		productTabbedPane.addTab("상품상세보기", null, productServePanel, null);
		productServePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane productServelScrollPane = new JScrollPane();
		productServePanel.add(productServelScrollPane, BorderLayout.CENTER);
		
		JPanel productDetailpanel = new JPanel();
		productDetailpanel.setPreferredSize(new Dimension(10, 550));
		productServelScrollPane.setViewportView(productDetailpanel);
		productDetailpanel.setLayout(null);
		
		JLabel productDetailImegeLabel = new JLabel("");
		productDetailImegeLabel.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\과일\\석류310.jpg"));
		productDetailImegeLabel.setBounds(12, 10, 310, 310);
		productDetailpanel.add(productDetailImegeLabel);
		
		JComboBox productDetailComboBox = new JComboBox();
		productDetailComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		productDetailComboBox.setBounds(205, 500, 39, 25);
		productDetailpanel.add(productDetailComboBox);
		
		JButton productDetailCartBtn = new JButton("");
		productDetailCartBtn.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\cart.png"));
		productDetailCartBtn.setBounds(255, 500, 67, 25);
		productDetailpanel.add(productDetailCartBtn);
		
		JLabel productDetailTitleLabel = new JLabel("상품명");
		productDetailTitleLabel.setFont(new Font("굴림", Font.BOLD, 15));
		productDetailTitleLabel.setBounds(12, 330, 310, 32);
		productDetailpanel.add(productDetailTitleLabel);
		
		JLabel productDetailExpLabel = new JLabel("상품설명");
		productDetailExpLabel.setBounds(12, 372, 311, 116);
		productDetailpanel.add(productDetailExpLabel);
		
		JLabel productDetailPriceLabel = new JLabel("상품가격");
		productDetailPriceLabel.setBounds(12, 500, 181, 25);
		productDetailpanel.add(productDetailPriceLabel);
		
		JPanel cartPanel = new JPanel();
		mainTabbedPane.addTab("\uC7A5\uBC14\uAD6C\uB2C8", null, cartPanel, null);
		
		JPanel orderPanel = new JPanel();
		mainTabbedPane.addTab("주문하기", null, orderPanel, null);
		
		JPanel noticePanel = new JPanel();
		mainTabbedPane.addTab("공지사항", null, noticePanel, null);
	}
}