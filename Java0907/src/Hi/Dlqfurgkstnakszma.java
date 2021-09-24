package Hi;

import java.util.Arrays;
import java.util.Scanner;

public class Dlqfurgkstnakszma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students ={"강나영", "강동환", "강태영", "곽지훈", "김서윤", "김영훈", "김진석", "김충신", "박슬기", 
		           "박채린", "손영태", "손영흔", "안정연", "이선우", "이수보", "이주홍", "이중호", "임현정",
		           "장유진", "정신애", "조수경", "조하영", "조혜민", "허민정", "박지은"};

		Scanner sc = new Scanner(System.in);
		System.out.println("몇명?>");
		int count = Integer.parseInt(sc.nextLine());
		
		String [] pick = new String [count];
		int pickCount = 0;
		
		do {
			int random = (int)(Math.random()*students.length);
			boolean flag = true;
			for(int i = 0; i < pick.length; i++) {
				if(students[random].equals(pick[i])) {
					flag = false;
				}
			}
			if(flag == true) {
				pick[pickCount++]=students[random];
			}
			
			
		}while(pickCount < count);
		  
      System.out.println(Arrays.toString(pick));
      
   }
}
