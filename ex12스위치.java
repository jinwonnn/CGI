package day02;

import java.util.Scanner;

public class ex12����ġ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int grade = sc.nextInt();
		String result = ""; // ���� ����� ���� ���̱�
		
		// switch ���� ���� ���� ������ ǥ���� �Ǿ�� �Ѵ�.
		// ������ ���� �� �ִ� ����� ������ ���� �ʴ�. -> break ��� �ʿ�!
		// 90 ~ 99 / 10 = 9 -> case �� �������� �����ϱ⿡ 
		switch(grade/10) {
		case 10:
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;			
		// �� ��������� �ش����� �ʴ� �༮��
		default:
			result = "D";
			break;
		}
		System.out.println( result + " ���� �Դϴ�.");
		
		
		
		
		
		
	}

}
