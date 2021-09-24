package Hi;

import java.util.Scanner;

public class Rhqgkrl {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		Scanner s = new Scanner(System.in);
		 
		do {
			System.out.println("1~100사이의 수를 입력해 주세요");
			input = Integer.parseInt(s.nextLine());
			
			if(answer<input) {
				System.out.println(input+"보다 작아용");
			}else if(answer>input) {
				System.out.println(input+"보다 커용");
			}else {
				System.out.println("정답!");
			}
			
		}while(answer!=input);
		
		
		
		
		
	}

}
