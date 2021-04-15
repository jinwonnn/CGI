package day04;

public class ex07배열_최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최소값 구하기
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int num = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < num) {
				num = arr[i];
			}

		}
		System.out.println("최소값은" + num);

	}

}
