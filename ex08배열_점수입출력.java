package day04;

import java.util.Scanner;

public class ex08�迭_��������� {
	
	public static void main(String[] args) {
	
		// 1. ũ�Ⱑ5�� ������ �迭 ����
	      int[] arr = new int[5];
	   
	      // 2. ������ �Է��Ͽ� �迭�� ����
	      Scanner sc = new Scanner(System.in);
	      
	      // ������ �������� �Է��� �� �ִ� for�� �ۼ�
	      for(int i =0; i <arr.length; i++) {
	         System.out.print(i+1+"��° �Է� >> ");
	         arr[i]= sc.nextInt();
	         }
	      // 3. �Էµ� ��� ������ ���! -> �ݺ�������  ��� for��
	      System.out.print("�Էµ� ���� : ");
	      for (int j=0; j< arr.length; j++) {
	         System.out.print(arr[j]+" ");
		
		

		
	      }	
	}
}
