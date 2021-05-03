import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ex_01 {

	private JFrame frame;
	private JTextField txt_ID;
	private JPasswordField txt_PW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex_01 window = new ex_01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ex_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 621, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID : ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(151, 223, 89, 31);
		frame.getContentPane().add(lblNewLabel);
		
		txt_ID = new JTextField();
		txt_ID.setBounds(194, 226, 255, 26);
		frame.getContentPane().add(txt_ID);
		txt_ID.setColumns(10);
		
		JLabel lblPassward = new JLabel("PW :");
		lblPassward.setForeground(new Color(255, 255, 255));
		lblPassward.setBackground(new Color(255, 255, 255));
		lblPassward.setFont(new Font("굴림", Font.BOLD, 14));
		lblPassward.setBounds(151, 259, 89, 31);
		frame.getContentPane().add(lblPassward);
		
		txt_PW = new JPasswordField();
		txt_PW.setBounds(194, 262, 255, 26);
		frame.getContentPane().add(txt_PW);
		
		JButton btn_Button = new JButton("Login");
		btn_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//버튼이 눌리게 되면 입력된 값들을 가져오는 기능!
				//getText()
				String id = txt_ID.getText();
				String pw = txt_PW.getText();
				
				System.out.println("아이디 : " + id);
				System.out.println("비밀번호 : " + pw);
				
				//기존의 프레임에서 새로운 프레임으로 이동하기!
				// 1. 새롭게 띄워주고 싶은 클래스의 객체 생성
				
				// 새로운 화면에서 데이터를 포함 할 수있도록 생성자 메소드 활용!
				ex_02 maingui = new ex_02(id);
//				maingui.main(null);
				
				// 2. 기존에 띄워져 있던 frame 을 닫아주기!
				// dispose() : frame 을 닫아주는 함수
				frame.dispose();
				
				
			}
		});
		btn_Button.setFont(new Font("굴림", Font.BOLD, 18));
		btn_Button.setBounds(252, 311, 116, 31);
		frame.getContentPane().add(btn_Button);
		
		JButton btn_Cancel = new JButton("Cancel");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//버튼이 눌리면 작성값들 리셋하기!
				txt_ID.setText(null);
				txt_PW.setText(null);
			}
		});
		btn_Cancel.setFont(new Font("굴림", Font.BOLD, 18));
		btn_Cancel.setBounds(252, 352, 116, 31);
		frame.getContentPane().add(btn_Cancel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM2144\\Downloads\\nike.jpg"));
		lblNewLabel_1.setBounds(-27, 41, 578, 175);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
