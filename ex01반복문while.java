package day03;

import java.util.Scanner;

public class ex01�ݺ���while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num2 = 0;
		
		int num1 = 0;
		
		//�����Է� ��¹� �ۼ�
		while(true) {
			System.out.print("�����Է� : ");
			//�����Է¹ޱ�
			int input = sc.nextInt();
			
			//-1 �Է½� ����
			if (input == -1){
				System.out.println("����Ǿ����ϴ�");
				break; //�ݺ��� ����
			}
			
			else if (input%2==0) {
				num2++;
			}
			else {
				num1++;
			}
			System.out.println("¦���� ���� : " + num2);
			System.out.println("Ȧ���� ���� : " + num1);
			}
			
			
		

		

	}

}
