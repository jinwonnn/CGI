package day02;

import java.util.Scanner;

public class ex08���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
//		if (num % 2 == 0) {
//			System.out.println(num +"�� ¦���Դϴ�");
//		}
//		else { 
//			System.out.println(num + "�� Ȧ���Դϴ�");
//			}
		// #Ư�� �������� ������ �� ������ , �� ���������� ����� �ȴ� -> ��������
		if (num % 2 == 0) {
			String result = "¦��";
			System.out.println(num + "��" + result +"�Դϴ�");
		}else {
			String result = "Ȧ��";
			System.out.println(num + "��" + result +"�Դϴ�");
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
