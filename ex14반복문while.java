package day02;

import java.util.Scanner;

public class ex14�ݺ���while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(num<10) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}	//��ȣ�� ���� �־�� �ݺ�����ϰ� num���� 10 �̻��Ͻ� ��ȣ ���ͼ� ���� ���Ṯ ����
		
		System.out.print("����Ǿ����ϴ�.");
	}
}