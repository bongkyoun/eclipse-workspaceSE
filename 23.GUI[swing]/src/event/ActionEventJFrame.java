package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
1. 이벤트 소스 결정 :하나의 윈도우에는 여러 개의 컴포넌트가 존재할 수 있으므로
					 실제로 이벤트가 발생되면 처리할 컴포넌트를 결정한다. 
2. 이벤트 핸들러(리스너) 클래스작성 : 
			이벤트를 실제적으로 처리할 수 있도록 
            해당 이벤트를 처리할 이벤트 리스너 인터페이스를 
            이용해서(구현) 이벤트 핸들러(리스너) 클래스를 작성한다. 

3. 이벤트 소스객체와 이벤트 핸들러(리스너)객체 연결 :
 				이벤트 리스너(핸들러)가 작성이되면 리스너(핸들러)와 이벤트 소스와 연결을 하여 
 				이벤트 소스에서 실제적으로 이벤트가 발생이 되면 처리할수 있도록 
				addXXListener()함수를 통해 연결을 시켜준다.  
				XX부분은 해당 컴포넌트에 붙일 수 있는 리스너 이름을 의미한다.
	 
	  ex>버튼에서발생하는 ActionEvent를 처리할 Handler(Listener)객체생성
	  
	  예를 들어 버튼에 ActionEvent을 처리하기 위하여 
	  버튼에다가 addActionListener를 붙이는 경우이다.
	  ex> 버튼객체.addActionListener(핸들러객체);
*/
//public class MouseHandler implements MouseListener {

//}
public class ActionEventJFrame extends JFrame {
	private JPanel contentPane;
	private JButton northBtn;
	private JButton southBtn;
	private JButton eastBtn;
	private JButton westBtn;

	public ActionEventJFrame() {
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setLayout(new BorderLayout());
		
		this.setContentPane(contentPane);

		/******** 이벤트소스 ***************/
		northBtn=new JButton("이벤트소쓰[NORTH]");
		southBtn=new JButton("이벤트소쓰[SOUTH]");
		eastBtn=new JButton("이벤트소쓰[EAST]");
		westBtn=new JButton("이벤트소쓰[WEST]");
		
		/******** 이벤트소스에 이벤트핸들러객체 등록***************/
		/**1. 외부 클래스**/
		northBtn.addActionListener(new NorthButtonActionEventHandler());
		/**2. 내부 클래스**/
		southBtn.addActionListener(new SouthButtonActionEventHandler());
		/**3. 이름없는 로컬 클래스**/
		ActionListener westButtonHandler = new ActionListener() {
		int count;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("west button click!!");
				/********outer 멤버 접근********/
				setTitle("west button click["+ ++count +"]");
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				contentPane.setBackground(new Color(r,g,b));
			}	
		};
		westBtn.addActionListener(westButtonHandler);
		eastBtn.addActionListener(new ActionListener() {
			int count;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("east button click!!!");
				/******outer 멤버 접근******/
				setTitle("east button click["+ ++count +"]");
				int r = (int)(Math.random()*256);
				int g= (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				contentPane.setBackground(new Color(r,g,b));
				
			}
		});
		
		
		contentPane.add(northBtn,BorderLayout.NORTH);
		contentPane.add(southBtn,BorderLayout.SOUTH);
		contentPane.add(eastBtn,BorderLayout.EAST);
		contentPane.add(westBtn,BorderLayout.WEST);
		this.setSize(300, 400);
	}
	/*********member inner class***********************/
	public class SouthButtonActionEventHandler implements ActionListener{
		int count;
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("집에 보내줘...");
			/*
			 * 프레임의 타이틀 변경 
			 * contentPane의 배경색변경
			 * ??????????
			 */
			setTitle("south button click["+ ++
					count +"]");
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			
			contentPane.setBackground(new Color(r,g,b));
		}
		
	}
	public static void main(String[] args) {
		ActionEventJFrame actionEventJFrame = new ActionEventJFrame();
		actionEventJFrame.setVisible(true);

	}

}