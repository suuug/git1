package Hi;

import java.util.Arrays;

public class Dpdlakak {

	public static void main(String[] args) {
		//1~5 ������ �������� 10�� ����� �迭���� �ߺ����� ���ŵ� �迭�� ����� �ּ���
		//[3,2,3,2,3,4,5,5,2,4]
		//[3,2,4,5]
		
		
		//10�� �迭�� 1~5�� �̷���� �迭 ����
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//�ߺ����� ���ŵ� �迭 �����
		int[] temp = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(temp));
		
		int count =0;
		for(int i = 0; i < arr.length; i++) {
			boolean flag = false;
		}for(int j = 0; j < arr.length; j++) {
			if(arr[i] == temp[j]) {
				 flag = true;
			}
			if(!flag) {
				temp[count++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		
		int[] result = new int[count];
		 for(int i = 0; i < result.length; i++) {
			 result[i] = temp[i];
		 }
		System.out.println(Arrays.toString(result));
		
	}
}