package day02;

import java.util.Scanner;

public class ex01��ĳ�� {

	public static void main(String[] args) {
		//1. ��ĳ�� ��� �ҷ�����
		
		Scanner sc = new Scanner(System.in);
				
	
		//2. Java���� �Է��̶�� ��¹��� �ۼ�
		System.out.print("Java ���� �Է� : ");
				
				
		//3. ����ڿ��� ���� �Է¹ޱ�
		int score1 = sc.nextInt();
		
		
		
		//4. Web���� �Է��̶�� ��¹� �ۼ�
		System.out.print("Web ���� �Է� : ");
		
		//5. ����ڿ��� ������ �Է¹ޱ�
		int score2 = sc.nextInt();
		
		//6. Android ���� �Է� ��¹� �ۼ�
		System.out.print("Android ���� �Է� : ");		
		
		//7. ����ڿ��� ������ �Է¹ޱ�
		int score3 = sc.nextInt();
		
		// **�ߺ� �ڵ� ������ ����� ȿ�������� ����ϱ�
		int total = (score1 + score2 + score3);
				
		//8. �հ�� ��� ��¹ޱ�
		System.out.println("�հ� : " + total);
		System.out.println("��� : " + total/3);
		
	}

}
