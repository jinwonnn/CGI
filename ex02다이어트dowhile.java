package day03;

import java.util.Scanner;

public class ex02���̾�Ʈdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		//���� ������ ��� �� �Է¹ޱ�
		System.out.print("���� ������ : ");
		int now = sc.nextInt();
		//��ǥ������ ��� �� �Է¹ޱ�
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();
		//--�ݺ�������
		//������ ���� ������ ��� �� �Է¹ޱ�
		do{
			//�ѹ��� ������ ����Ǿ��ϴ� �κ�
			//�ݺ��۾��� ������ �κ�
			System.out.print(cnt + "���� ���� ������ : ");
			int minus = sc.nextInt();
			now = now - minus; //now -= minus; (���մ��Կ�����)
			cnt++;
		}while(now > goal); //while�� Ʈ���϶��� �����ϱ⿡ ���繫�� > ��ǥ���� // if ��� �ݴ�
		
		System.out.println(now +" kg �޼� �����մϴ�");
		
		//��ǥġ �޼������� �����մϴ� �޼��� �����ϱ�

	}

}
