import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Rectangle;

public class MusicPlayerGUI {

	private JFrame frame;

	MusicPlayer mp = new MusicPlayer();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerGUI window = new MusicPlayerGUI();
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
	public MusicPlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 504, 195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 464, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_info = new JLabel("Music info");
		lbl_info.setPreferredSize(new Dimension(62, 20));
		lbl_info.setForeground(new Color(0, 0, 0));
		lbl_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_info.setFont(new Font("HY엽서M", Font.PLAIN, 25));
		lbl_info.setBackground(new Color(230, 230, 250));
		panel.add(lbl_info, "name_614529480502000");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 109, 464, 37);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("◀◀");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music song = mp.prePlay();
				lbl_info.setText(mp.musicInfo(song));
				
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("▶");
		btnNewButton_2.addActionListener(new ActionListener() {
			//버튼에 액션을 감지할 수 있는 메소드 부여하기!
			public void actionPerformed(ActionEvent e) {
				
				
				// 버튼이 눌리면 현재 재생곡 정보 띄우기 -> musicInfo()
				// 라벨에 가져온 음악 정보 띄우기
				// setText() ; 라벨의 내용을 지정하기 위한 메소드 (string)
				// getText() ; 라벨에 있는 내용을 가져오기 위한 메소드
				Music song = mp.play();
				lbl_info.setText(mp.musicInfo(song));
				
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("■");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.stop();
				lbl_info.setText("노래가 정지되었습니다.");
				
				
				
			}
		});
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("▶▶");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music song = mp.nextPlay();
				lbl_info.setText(mp.musicInfo(song));
				
			}
		});
		panel_1.add(btnNewButton_1);
	}
}
