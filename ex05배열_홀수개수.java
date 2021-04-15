package day04;

public class ex05배열_홀수개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열선언 후 초기화
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int cnt = 0;
		// 홀수 값 출력
		System.out.print("arr에 들어있는 홀수는 ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				cnt++;
				System.out.print(arr[i] + " " );

			}
		}
		System.out.print("이며 " + cnt + " 개 입니다.");
		// 홀수 갯수 출력

	}

}
