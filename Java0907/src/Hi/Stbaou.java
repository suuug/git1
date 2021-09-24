package Hi;

import java.util.Scanner;

public class Stbaou {

	public static void main(String[] args) {
		/*
		 * 랜덤 숫자 3개를 맞추는것 
		 * 스트라이크: 숫자와 자릿수가 똑같을때 1S 
		 * 볼: 숫자는 똑같은데 자릿수가 다를때 1B 
		 * 아웃: 아예 같은 수가
		 * 없을때 1O
		 * 
		 * 1-9까지 숫자를 서로다르게 랜덤발생 숫자를 입력받아서 스트라이크, 볼, 아웃을 만들어낸다.
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
			 
			 System.out.println("첫자리를 입력해 주세요>");
			 int num1 = Integer.parseInt(s.nextLine());
			 System.out.println("둘째자리를 입력해 주세요>");
			 int num2 = Integer.parseInt(s.nextLine());
			 System.out.println("셋째자리를 입력해 주세요>");
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
