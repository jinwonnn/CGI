package day05;

public class ex06메소드_데이터출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,4,8,7,9,10};
		
		arrayToString(array);
	}
	public static void arrayToString(int[] array) {
		for(int i= 0; i< array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		
	}

}
