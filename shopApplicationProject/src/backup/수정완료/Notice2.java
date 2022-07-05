package backup.수정완료;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Notice2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Notice2() {
		setLayout(null);
		
		JLabel noticeListMainLB = new JLabel("공지사항");
		noticeListMainLB.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		noticeListMainLB.setBounds(146, 29, 77, 23);
		add(noticeListMainLB);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 63, 390, 539);
		add(panel);
		panel.setLayout(null);

	}
}
