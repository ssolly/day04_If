package day04_If;

import java.util.Scanner;

public class Ex04_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.print("�� �Է� : ");
		select=sc.nextInt();
		
		switch(select) {
			case 1 : System.out.println("1.�Է°� : " + select);
			break;		//break�� ������ ���� ���׵� ��µȴ�, switch���� �������� �� ���
			case 2 : System.out.println("2.�Է°� : " + select);
			break;
			case 3 : System.out.println("3.�Է°� : " + select);
			break;
			default : System.out.println("1,2,3�� ������ �ٸ� �� �Է�");
		
		}
	}
}
