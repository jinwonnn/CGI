package day03;

import java.util.Scanner;

public class ex07for�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ������ �Է¹޾� 1~�Է¹��� �� ����
// ���! ex)7 -> 1~7���� ���ϱ�		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		int i = 0;
		
		for(i=1; i<=num; i++) {
			System.out.print(i+ " ");
		}
		int total = i+i;
		System.out.println("�������� �� : " + total);
		
	}

}
