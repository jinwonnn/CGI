package day04;

import java.util.Scanner;

public class ex09�迭_3�ǹ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		//�����Է¹޾� ����
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "��° ���� �Է� : "); // �ε����� 0���� ���������� (i+1) ���ִ� ��
			arr[i] = sc.nextInt(); //(�Է¹޾� ����)
			
		}
		System.out.print("3�� ��� : ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
