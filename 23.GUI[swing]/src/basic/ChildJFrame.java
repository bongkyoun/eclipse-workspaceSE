package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */

public class ChildJFrame extends JFrame{
	private JPanel contentPane;
	/*
	 * 컴포넌트를 멤버필드로 선언
	 */
	private JButton okBtn;
	private JButton cancleBtn;
	public ChildJFrame() {
		this.setTitle("줌수업 들을껄");
		this.contentPane = new JPanel();
		this.setContentPane(contentPane);
		contentPane.setBackground(Color.BLUE);
		/*
		 * 컴포넌트 객체 생성
		 */
		
		okBtn = new JButton("확인");
		cancleBtn = new JButton("취소");
		/*
		 * 컨테이너에 컴포넌트를 붙힌다
		 */
		contentPane.setLayout(null);
		okBtn.setBounds(40, 40, 80, 40);
		cancleBtn.setBounds(130, 40, 80, 40);
		contentPane.add(okBtn);
		contentPane.add(cancleBtn);
		
		/*
		 * JFrame의크기설정
		 */
		this.setSize(300, 400);
	}
	public static void main(String[] args) {
		/*
		 * JFrame객체생성
		 */
		ChildJFrame childJFrame = new ChildJFrame();
		
		/*
		 * JFrame객체 화면에보여주세요
		 */
		childJFrame.setVisible(true);
		
		/*
		 * Container[JFrame].setVisible(true);
		 *   - 메인쓰레드가 호출하면[호출되면] JVM이 GUI쓰레드를 생성
		 *   - GUI쓰레드는 무한대기 하면서이벤트와 그래픽 처리를 담당
		 *   - Container[JFrame] 는 계속떠있다.
		 *      (JVM이 종료되지않는다)
		 */
		return;
		
	}
}