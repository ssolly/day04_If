package day04_If;

import java.util.Scanner;

public class Ex05_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("���ڿ� �Է� : ");
		str = sc.next();
		switch(str) {
			case "�ȳ�" : 
				System.out.println("�ȳ��� �Է�");
				break;
			case "�׷�" :
				System.out.println("�׷��� �Է�");
				break;
		}
	}
}
