package Hi;

import java.util.Scanner;

public class Rhqgkrl {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		Scanner s = new Scanner(System.in);
		 
		do {
			System.out.println("1~100������ ���� �Է��� �ּ���");
			input = Integer.parseInt(s.nextLine());
			
			if(answer<input) {
				System.out.println(input+"���� �۾ƿ�");
			}else if(answer>input) {
				System.out.println(input+"���� Ŀ��");
			}else {
				System.out.println("����!");
			}
			
		}while(answer!=input);
		
		
		
		
		
	}

}
