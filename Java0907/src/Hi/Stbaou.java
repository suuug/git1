package Hi;

import java.util.Scanner;

public class Stbaou {

	public static void main(String[] args) {
		/*
		 * ���� ���� 3���� ���ߴ°� 
		 * ��Ʈ����ũ: ���ڿ� �ڸ����� �Ȱ����� 1S 
		 * ��: ���ڴ� �Ȱ����� �ڸ����� �ٸ��� 1B 
		 * �ƿ�: �ƿ� ���� ����
		 * ������ 1O
		 * 
		 * 1-9���� ���ڸ� ���δٸ��� �����߻� ���ڸ� �Է¹޾Ƽ� ��Ʈ����ũ, ��, �ƿ��� ������.
		 */

		Scanner s = new Scanner(System.in);
		
		int st = 0;
		int ba = 0;
		int ou = 0;
		
		int r1;
		int r2;
		int r3;
		
		do {
		 r1 = (int)(Math.random()*9)+1;
		 r2 = (int)(Math.random()*9)+1;
		 r3 = (int)(Math.random()*9)+1; 
		}while( r1 == r2 || r1 == r3 || r2 == r3);
		 
		
		do {
			 int input = 100 * r1 + 10 * r2 + 1 * r1;
			
			 st = 0;
			 ba = 0;
			 ou = 0;
			 
			 System.out.println("ù�ڸ��� �Է��� �ּ���>");
			 int num1 = Integer.parseInt(s.nextLine());
			 System.out.println("��°�ڸ��� �Է��� �ּ���>");
			 int num2 = Integer.parseInt(s.nextLine());
			 System.out.println("��°�ڸ��� �Է��� �ּ���>");
			 int num3 = Integer.parseInt(s.nextLine());
			
			 if(num1 == r1) {
				 st += 1;
			 }else if(num1 == r2) {
				 ba += 1;
			 }else if(num1 == r3) {
				 ba += 1;
			 }else if(num1 != r1) {
				 ou += 1;
			 }else if(num1 != r2) {
				 ou += 1;
			 }else if(num1 != r3) {
				 ou += 1;
			 }
			 if(num2 == r2) {
				 st += 1;
			 }else if(num2 == r1) {
				 ba += 1;
			 }else if(num2 == r3) {
				 ba += 1;
			 }else if(num2 != r1) {
				 ou += 1;
			 }else if(num2 != r2) {
				 ou += 1;
			 }else if(num2 != r3) {
				 ou += 1;
			 }
			 
			 if(num3 == r3) {
				 st += 1;
			 }else if(num3 == r1) {
				 ba += 1;
			 }else if(num3 == r2) {
				 ba += 1;
			 }else if(num3 != r1) {
				 ou += 1;
			 }else if(num3 != r2) {
				 ou += 1;
			 }else if(num3 != r3) {
				 ou += 1;
			 }
			 
			 System.out.println("st: "+st+" ba: "+ba+" ou: "+ou);
			
		}while(st != 3);
		

	}

}
