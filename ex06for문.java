package day03;

public class ex06for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//21부터 57까지 출력
//			int i = 0;
//			for(i = 21; i<=57; i++){
		
//				System.out.println(i);
//	}
		//96부터 53까지 출력
//		int i = 0;
//		for(i = 96; i>52; i--) {
//			System.out.println(i);
//		}

		//for문, 21~57 중 홀수만 출력
//		int i = 0;
//		for(i = 21; i <= 57; i++) {
//			if(i % 2 ==1) {
//				System.out.println(i);	
//			}
//			
//		}
		//1 ~100 , 3의 배수에 대한 누적 합을 출력하기
		int i = 0;
		int sum = 0;
		for(i = 0; i<=100; i++) {
			if( i % 3 == 0) {
				sum+=i;
				
			}
		}
		System.out.println("3의 배수의 누적합 : " + sum);
		
		
		
		
	}

}
