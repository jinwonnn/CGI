package day02;

import java.util.Scanner;

public class ex15�ݺ���while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("A�� �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("B�� �Է� : ");
			int num2 = sc.nextInt();
			
			if(num1==0 && num2==0) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("��� : " + (num1-num2));
			}
		
		}
		
			
	}
	

}
