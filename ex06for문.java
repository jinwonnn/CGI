package day03;

public class ex06for�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//21���� 57���� ���
//			int i = 0;
//			for(i = 21; i<=57; i++){
		
//				System.out.println(i);
//	}
		//96���� 53���� ���
//		int i = 0;
//		for(i = 96; i>52; i--) {
//			System.out.println(i);
//		}

		//for��, 21~57 �� Ȧ���� ���
//		int i = 0;
//		for(i = 21; i <= 57; i++) {
//			if(i % 2 ==1) {
//				System.out.println(i);	
//			}
//			
//		}
		//1 ~100 , 3�� ����� ���� ���� ���� ����ϱ�
		int i = 0;
		int sum = 0;
		for(i = 0; i<=100; i++) {
			if( i % 3 == 0) {
				sum+=i;
				
			}
		}
		System.out.println("3�� ����� ������ : " + sum);
		
		
		
		
	}

}
