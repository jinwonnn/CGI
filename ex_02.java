import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex_02 {
	// ex_01 에서 로그인 버튼을 클릭시 실행되는 창
	// 
	// 클래스의 필드(속성, 데이터) 부분
	private JFrame frame;
	String id;
	
	/**
	 * Launch the application.
	 */
	// 프로그램의 시작 메소드로부터 같은 환경에서 데이터를 넘겨주기 위하여 다른 main()는 사용하지 않는다.
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ex_02 window = new ex_02();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public ex_02() {
		initialize();
	}

	// 생성자 메소드 오버로딩(중복정의)
	public ex_02(String id) {
		this.id = id;
		initialize();
		frame.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 641, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(id + "님 환영합니다 !!");
		lblNewLabel.setBounds(171, 199, 350, 65);
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("HY얕은샘물M", Font.BOLD, 44));
		frame.getContentPane().add(lblNewLabel);
		
		// 이미지를 불러오기 위한 작성법1
		// ImageIcon -> 이미지를 추가하기 위한 클래스
		ImageIcon img = new ImageIcon("image/캡처.PNG");
		
		// ImageIcon 으로부터 실제 이미지만 가지고 올 수 있도록 처리!
		Image pic = img.getImage();
		Image changepic = pic.getScaledInstance(374, 123, 0);
		
		// 변경된 이미지를 띄울 ImageIcon 생성
		ImageIcon changeImg = new ImageIcon(changepic);
		
		// 이미지 액션을 위한 새로운 이미지 추가하기!
		ImageIcon img2 = new ImageIcon("image/메종마틴마르지엘라_maison_martin_margiela_로고.jpeg");
		Image pic2 = img2.getImage();
		Image changepic2 = pic2.getScaledInstance(623, 197, 0);
		ImageIcon changeImg2 = new ImageIcon(changepic2);
		
		//이미지를 삽입하기 위한 라벨
		JLabel lblNewLabel_1 = new JLabel(changeImg);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스가 라벨의 영역 안으로 들어왔을 떄 (고체)
				lblNewLabel_1.setIcon(changeImg2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 라벨 벗어났을 때 (원본)
				lblNewLabel_1.setIcon(changeImg);
			}
		});
//		
//		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM2144\\Downloads\\캡처.PNG"));
		lblNewLabel_1.setBounds(0, 0, 623, 197);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
