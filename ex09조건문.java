package day02;

import java.util.Scanner;

public class ex09���ǹ� {

	public static void main(String[] args) {
		// �ݿø��� %10 // 10���� ���� �������� ���ϸ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int num = sc.nextInt();
		
		int n = num%10; //�ݿø� ���ڸ� ���ϱ� 
		int result = 0;
		if (n >=5) {
			result = (num/10+1) *10; //10���� ���� �� +1 , 1���ڸ��� *10���� reset
		}else {
			result = (num/10) *10;
		}
		
 	
		System.out.println("�ݿø� �� : " + result);

	}

}
