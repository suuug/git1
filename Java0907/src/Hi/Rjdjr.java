package Hi;

import java.util.Arrays;

public class Rjdjr {

	public static void main(String[] args) {
		// 1~10���� �̷���� 500���� �����Լ��� ���� �߻� Ƚ��
		
//		int[] count = new int[10];
//		for(int i = 0; i < count.length; i++) {
//			int random = (int)(Math.random()*10)+1;
//			count[random - 1]++;
//		}
//         for(int i = 0; i < count.length; i++) {
//        	 System.out.println(i+1+"�� �߻� Ƚ����"+count[i]);
//         }
         
         // �Ž������� ������ �������� ��� ������ �ʿ����� ������ּ���
         
			/*
			 * int[] coin = {500,100,50,10}; int money = (int)(Math.random()*500)*10;
			 * System.out.println("�Ž�����: "+ money);
			 * 
			 * for(int i = 0; i < coin.length; i++) { int count = money / coin[i]; money %=
			 * coin[i]; System.out.println(coin[i]+"��: "+count+"��"); }
			 */
		
//		1~5�� ���ڰ� �߻��� Ƚ����ŭ *�� ����� �׷����� �׷��ּ���
//		  1:***3 //�ϴ� ���ں��� ���ߴ�
//		  2:****4
//		  3:**2
//		  4:*****5
//		  5:******6
		
		int[] arr = new int [20];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int [] count = new int[5];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]-1]++;
		}
		for(int i = 0; i < count.length; i++) {
			System.out.print(i+1+":");
		for(int j = 0; j < count[i]; j++) {
			System.out.print("*");
		}
		System.out.println(" "+ count[i]);
	}
	}
}
