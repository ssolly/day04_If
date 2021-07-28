package day04_If;

import java.util.Scanner;

public class Ex03 {

	/*
	  -형식
	   if(조건) {
	   } else if(조건) {
	   } else if(조건) {
	   } else {
	   }
	  - 조건식을 조금 더 상세히 나눈 것
	  - if, else와 마찬가지로 조건식들 중 참인 조건 하나만 실행
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("수 입력 : ");
		num=sc.nextInt();
		
		if (num>100) {
			System.out.println(num+" : 100보다 크다");
		} else if (num>50) {
			System.out.println(num+" : 50보다 크다");
		} else {
			System.out.println(num + " : 50보다 작은 값들");
		}
		System.out.println("다음 문장들 실행");
	}
}
