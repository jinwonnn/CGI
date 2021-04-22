package day05;

public class ex07메소드_약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDivisor(10);
	}

	public static void getDivisor(int num) {
		System.out.println(num + "의 약수");
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}

		}
	}
}
