package day04_If;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 ��¥�� �Է� �޾� 1���̸� '��', 2���̸� 'ȭ' ... 7���̸� '��', 8���̸� '��'..
		 ���ڿ� ���� ������ ����Ͻÿ�
		*/
		int day;
		System.out.print("��¥ �Է� : ");
		day=sc.nextInt();
		
		switch(day%7) {
		case 0 :
			System.out.println("��");
		case 1 : 
			System.out.println("��");
			break;
		case 2 :
			System.out.println("ȭ");
			break;
		case 3 :
			System.out.println("��");
			break;
		case 4 :
			System.out.println("��");
			break;
		case 5 :
			System.out.println("��");
		case 6 :
			System.out.println("��");
			break;
		}
		
		/*
		 �츮��, ȸ�� ��� �� ����
		 */
		int num;
		String home=null,company = null;
		
		while(true) {
			System.out.println("1. �츮�� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ��� ����");
			System.out.print(">>> ");
			num=sc.nextInt();
			
			switch(num) {
			case 1 :
				System.out.print("�츮�� : ");
				home=sc.next();
				break;
			case 2 :
				System.out.print("ȸ�� : ");
				company=sc.next();
				break;
			case 3 :
				System.out.println("�츮�� : " + home);
				System.out.println("ȸ�� : " + company);
				break;
			}
		}
		
	}
}
