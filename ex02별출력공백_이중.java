package day04;

public class ex02별출력공백_이중 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;

		for (i = 0; i < 5; i++) {
			for (j = 5; j >= 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}System.out.println();
		}

	}

}
