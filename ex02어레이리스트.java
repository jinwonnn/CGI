package day06;

import java.util.ArrayList;

public class ex02��̸���Ʈ {

	public static void main(String[] args) {
		// ArrayList >> �ڹ� �迭�� �Ѱ踦 �غ��ϴ� ���
		// �ڹ� �迭�� ����� �����Ǿ��ִ�. 3ĭ¥������ �������� 3���� �������ִ� �Ѱ�
		// arrayList > �����͸� ���������� ������ �ڵ����� �Ҵ� >> python ���� ����
		
		//1. �����ϱ� 
		String[] arr = new String[3];
		ArrayList<String> arr2 = new ArrayList<String>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		//1. ��̸���Ʈ �ǵڿ� ������ �ֱ�.
		arr2.add("�Ӹ���");
		arr2.add("����");
		arr2.add("ä����");
		
		
		//2. ��̸���Ʈ �� �����͸� ������ö��� .get(index) ��� Ȱ��
//		System.out.println(arr2.get(0));
		
		//3. ��ü ������ ���
		//4. �迭�� ���̸� ���ؿö��� length �� �ƴϰ� .size(); �� ����
//		for(int i = 0; i<arr2.size(); i++) {
//			System.out.println(arr2.get(i) + " ");			
//		}
		
		//5. ���ϴ� ��ġ ������ �ٲٱ�
		arr2.add(0,"���ؼ�");
		
		for(int i = 0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i) + " ");		
		
		}
		//6. ���ϴ� ��ġ ������ ����(remove.�ε����ڸ���)
		arr2.remove(0);
		for(int i = 0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i) + " ");		
		
		}
		System.out.println("=======");
		
		//7. ��ü������ ���� removeAll(����Ʈ�̸�)
		arr2.removeAll(arr2);
		for(int i = 0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i) + " ");		
		
		}
	}

}
