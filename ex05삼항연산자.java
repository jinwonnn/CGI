package day02;

import java.util.Scanner;

public class ex05���׿����� {

	public static void main(String[] args) {
		// �󱸰����.  �ϳ��ǻ��ڿ� 5��
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
	
	int ball = sc.nextInt();
	
	int box = (ball/5);
	
	System.out.print((ball%5>0 ? "�ʿ��� ������ �� : " + (box+1) : "�ʿ��� ������ �� : " + (box)));
	
	
	
	
	
	
	}

}
