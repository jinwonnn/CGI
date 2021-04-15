package day04;

public class ex14이차원배열 {

	public static void main(String[] args) {

		// 2차원 배열 선언하기
		int[][] arr = new int[5][5];
		
		int data = 0;
		
		// 값을 저장해주기 위한 작업
		// 층수를 반복하기 위한 for문(행)
		for(int i = 0; i < 5; i++ ) {
			
			// 호수를 반복하기 위한 for문(열)
			for(int j = 0; j < 5; j++) {
				arr[i][j] = data;
				data++;
			}
		
		}
		//값을 확인해주기 위한 작업
		for(int i = 0 ; i < 5 ; i++) {

			for(int j = 4 ; j >= 0 ; j--) {   // <<역순으로 가는법 j=0 ; j<5, j++ > 정방향
				System.out.print(arr[i][j] + "\t");
			}
			// 층을 나누기 위한 개행작업
			System.out.println();
		//층수와 호수에 대한 길이를 따로따로 확인할 수 있다.
		//층수와 호수에 대한 크기가 서로 다를수 있기 떄문에
			//층수 -> 배열의이름.length
			//호수 -> 배열의이름[층수].length
			
			//일차원배열 int[]
			//2차원배열 int[][]  -> 다차원배열
			//공통점 : 배열의 크기가 지정되어 있다. -> 파이썬 튜플
			
			//가변배열 : 배열의 크기가 지정되어 있지 않다. -> 파이썬 리스트와 비슷
			
		}
		
	}
}

		
//		arr[0][0] = 0;
//		arr[0][1] = 1;
//		arr[0][2] = 2;
//		arr[0][3] = 3;
//		arr[0][4] = 4;
//		
//		arr[1][0] = 5;
//		arr[1][1] = 6;
//		arr[1][2] = 7;
//		arr[1][3] = 8;
//		arr[1][4] = 9;
	

