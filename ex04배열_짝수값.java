package day04;

public class ex04배열_짝수값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 임의 배열 생성
		int [] arr = {1,2,3,4,5,6,7,8};
			
		//2. 전체 배열을 검사 진행 후, 짝수인 값만 출력
		System.out.print("arr에 들어있는 짝수는 ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("입니다.");
		 
	}

}
