import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class WindowBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// 실제 프레임을 띄워주기 위한 메소드
			public void run() {
				// 자바의 오류
				// 1. 컴파일 오류 : 문법이 잘못되었을 떄
				// 2. 런타임 오류 : 문법에는 잘못이 없지만 실행시 오류가 발생되는 것
				try {
					WindowBuilder window = new WindowBuilder();
					// 실제 화면에 프레임을 띄워주는 메소드 boolean 형태의 값만 들어갈 수 있음
					// true : 창이 보임
					// false : 창이 보이지 않음
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
	// 접근지정자 , 클래스의 이름과 동일 -> 생성자 메소드
	public WindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();    
		// setBounds() > 프레임의 크기와 위치를 지정하는 메소드
		// (x축, y축, 가로, 세로)
		frame.setBounds(300, 100, 650, 300);
		
		//프레임 닫아주는 역할
		//생략시 : 프레임은 닫히지만 프로그램 자체는 돌아가는 중
		//작성시 : 프레임과 동시에 프로그램이 닫히는 기능
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("안녕하세요 여러분");
		lblNewLabel.setBounds(0, 0, 634, 24);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setOpaque(true);  
		//setOpaque : 투명으로 기본값이 설정되어 있는 라벨의 옵션을 풀어주는 기능!
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("클릭");
		btnNewButton.setBounds(0, 238, 634, 23);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(10, 34, 97, 23);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(10, 67, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(10, 100, 105, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
