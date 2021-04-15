package day04;

import java.util.Scanner;

public class ex08배열_점수입출력 {
	
	public static void main(String[] args) {
	
		// 1. 크기가5인 정수형 배열 생성
	      int[] arr = new int[5];
	   
	      // 2. 점수를 입력하여 배열에 저장
	      Scanner sc = new Scanner(System.in);
	      
	      // 점수를 연속적을 입력할 수 있는 for문 작성
	      for(int i =0; i <arr.length; i++) {
	         System.out.print(i+1+"번째 입력 >> ");
	         arr[i]= sc.nextInt();
	         }
	      // 3. 입력된 모든 점수를 출력! -> 반복적으로  출력 for문
	      System.out.print("입력된 점수 : ");
	      for (int j=0; j< arr.length; j++) {
	         System.out.print(arr[j]+" ");
		
		

		
	      }	
	}
}
