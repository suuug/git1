package Hi;

import java.util.Arrays;
import java.util.Scanner;

public class Dlqfurgkstnakszma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students ={"������", "����ȯ", "���¿�", "������", "�輭��", "�迵��", "������", "�����", "�ڽ���", 
		           "��ä��", "�տ���", "�տ���", "������", "�̼���", "�̼���", "����ȫ", "����ȣ", "������",
		           "������", "���ž�", "������", "���Ͽ�", "������", "�����", "������"};

		Scanner sc = new Scanner(System.in);
		System.out.println("���?>");
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
