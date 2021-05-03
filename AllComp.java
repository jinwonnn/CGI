import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AllComp {

	private JFrame frame;
	private JTextField txt_name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllComp window = new AllComp();
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
	public AllComp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 363, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "name_702808383194400");
		
		
		// 탭으로 사용하기 위하여 만들어진 Panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("화면1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.BOLD, 16));
		lblNewLabel.setBounds(58, 10, 59, 36);
		panel.add(lblNewLabel);
		
		txt_name = new JTextField();
		txt_name.setBounds(109, 18, 184, 23);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("성별");
		lblNewLabel_1.setFont(new Font("HY헤드라인M", Font.BOLD, 16));
		lblNewLabel_1.setBounds(58, 59, 59, 36);
		panel.add(lblNewLabel_1);
		
		JRadioButton rd_male = new JRadioButton("남자");
		buttonGroup.add(rd_male);
		rd_male.setBackground(new Color(230, 230, 250));
		rd_male.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rd_male.setBounds(121, 58, 74, 40);
		panel.add(rd_male);
		
		JRadioButton rd_female = new JRadioButton("여자");
		buttonGroup.add(rd_female);
		rd_female.setBackground(new Color(230, 230, 250));
		rd_female.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rd_female.setBounds(200, 58, 93, 40);
		panel.add(rd_female);
		
		JLabel lblNewLabel_1_1 = new JLabel("취미");
		lblNewLabel_1_1.setFont(new Font("HY헤드라인M", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(58, 105, 59, 36);
		panel.add(lblNewLabel_1_1);
		
		JCheckBox cb2 = new JCheckBox("헬스");
		cb2.setBackground(new Color(230, 230, 250));
		cb2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cb2.setBounds(118, 113, 59, 23);
		panel.add(cb2);
		
		JCheckBox cb1 = new JCheckBox("풋살");
		cb1.setBackground(new Color(230, 230, 250));
		cb1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cb1.setBounds(181, 113, 59, 23);
		panel.add(cb1);
		
		JCheckBox cb3 = new JCheckBox("코딩");
		cb3.setBackground(new Color(230, 230, 250));
		cb3.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cb3.setBounds(246, 113, 59, 23);
		panel.add(cb3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("좋아하는 음식");
		lblNewLabel_1_1_1.setFont(new Font("HY헤드라인M", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(12, 151, 105, 36);
		panel.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(230, 230, 250));
		comboBox.setAutoscrolls(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"치킨", "피자", "햄버거", "아이스크림"}));
		comboBox.setBounds(140, 159, 144, 23);
		panel.add(comboBox);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 273, 318, 199);
		panel.add(textPane);
		
		JButton btnNewButton = new JButton("작성완료");
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼이 클릭되면 작성된 내용들을 읽어오기
				
				// TextPane 에 내용을 누적하기 위한 변수
				String message; 
				
				
//				String name = txt_name.getText();
				message = txt_name.getText();
				// 라디오 버튼 선택값 가져오기 >> isSelected() : boolean 형태 
				if(rd_male.isSelected()) {
					String gender = rd_male.getText();
					message += "\n" + gender; //( "\n" 으로 줄바꿈실행)
				}else {
					String gender = rd_female.getText();
					message += "\n" + gender;
				}
				
				if(cb1.isSelected()) {
					message += "\n" + cb1.getText();
				}if(cb2.isSelected()) {
					message += "\n" + cb2.getText();
				}if(cb3.isSelected()) {
					message += "\n" + cb3.getText();
				}
				
				// ComboBox 선택내용가져오기
				// getSelecteditem
				message +="\n" + comboBox.getSelectedItem();
				
				// 문자열로 가져와야 할 경우 
				// 1. 형변환 : (String)
				// 2. 함수사용 : toString() -> JDBC 사용시 많이 활용
				
				
				
				// TextPane 에 입력, 선택 값 띄워주기
				textPane.setText(message);
				
				
			}
			
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton.setBounds(94, 214, 134, 30);
		panel.add(btnNewButton);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("화면2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 20, 318, 344);
		panel_1.add(scrollPane);
		
		// Table 데이터 만들기
		String[] col = {"이름", "나이"};
		Object[][] data = {{"나원진", 20},{"나원진", 20},{"나원진", 20},{"나원진", 20}};
		// 데이터에 문자형을 포함한 정수형이 포함되면 모든 형태를 담아낼수 있는 Object로 만들어준다!
		
		// Jtable(데이터, 컬럼이름);
		table = new JTable(data, col);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uB098\uC6D0\uC9C4", new Integer(20), "\uB0A8\uC790"},
				{"\uB098\uC6D0\uC9C4", new Integer(20), "\uC5EC\uC790"},
				{"\uB098\uC6D0\uC9C4", new Integer(20), "\uC5EC\uC790"},
				{"\uB098\uC6D0\uC9C4", new Integer(20), "\uB0A8\uC790"},
			},
			new String[] {
				"\uC774\uB984", "\uB098\uC774", "\uC131\uBCC4"
			}
		));
		scrollPane.setViewportView(table);
		
		// table 관련 속성
		// 1. 셀 이동 막기
		table.getTableHeader().setReorderingAllowed(false);
		// 2. 셀 크기변경 막기
		table.getTableHeader().setResizingAllowed(false);
		// 3. 셀 높이 변경하기
		table.setRowHeight(30);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("화면3", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("화면4", null, panel_3, null);
	}
}
