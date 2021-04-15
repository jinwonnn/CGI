package day04;

import java.util.Scanner;

public class ex09배열_3의배수입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		//숫자입력받아 저장
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : "); // 인덱스가 0부터 시작함으로 (i+1) 해주는 것
			arr[i] = sc.nextInt(); //(입력받아 저장)
			
		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
