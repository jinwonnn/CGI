package day03;

import java.util.Scanner;

public class ex03�α������α׷�while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �α��� ��� �����
			
		// ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		while(true) {
		// ���̵� �Է��ϼ��� ��� �� �Է¹ޱ�
		System.out.print("���̵� �Է��ϼ��� : ");
		String id = sc.next();
		// ��й�ȣ�� �Է��ϼ��� ��� �� �Է¹ޱ�
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String pw = sc.next();
		
		// ���̴ٰ� Hello �̸鼭 ��й�ȣ�� 1234 �϶� �α��� ����! >> ���α׷� ����
		if(id.equals("Hello") && pw.equals("1234")){
				
			//�������� ��
			System.out.println("�α��� ����!");
			break;
		}else {
			//�������� ��
			System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ���~");
			//����ڿ��� ����� �ٽ��ϰڽ��ϱ�? (Y/N)
			System.out.print("���Է� �Ͻðڽ��ϱ�? (Y/N) ");
			String re = sc.next();
			if(re.equals("N")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(re.equals("Y")) {
				continue;
			}
				
			
			// Y �Է¹ޱ� . �ٽ��ϱ� // N �Է¹ޱ� . �����ϱ�
			// N�� �Է¹����� ���α׷� �������
		}
		// ���� �ϳ��� Ʋ�� ��쿡�� ���̵� ��й�ȣ�� Ȯ�����ּ��� ���1 >> �ٽ� �ݺ��� ���
		
	}	
		
		
		

	}

}
