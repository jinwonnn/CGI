package day02;

import java.util.Scanner;

public class ex10���ǹ� {
	
	public static void main(String[] args) {
		//���� �ð� �Է� �޾� �� �ӱ��� ����ϴ� �ñް��� �����. �ñ� : 5000��, 8�ð� �ʰ� 1.5��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð� : ");
		
		int input = sc.nextInt();
		
//		double overtime = (input-8)*1.5;
//		
//		if(input>8) {
//			System.out.println("�� �ӱ���" + ((input*5000)+(overtime*5000)) + "�� �Դϴ�.");
//		}else {
//			System.out.println("�� �ӱ���" + (input*5000) + "�� �Դϴ�.");
//		}
		int result = 0;
		
		if(input<=8) {
			result = input*5000;
		}else {
			result = 40000 + (int)((input-8)*5000*1.5); //����ȯ �Ǽ��� int !
		}
		
		System.out.println("�� �ӱ��� " + result + "�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
