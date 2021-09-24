package Hi;

import java.util.Arrays;

public class Dpdlakak {

	public static void main(String[] args) {
		//1~5 사이의 랜덤값이 10개 저장된 배열에서 중복값이 제거된 배열을 만들어 주세요
		//[3,2,3,2,3,4,5,5,2,4]
		//[3,2,4,5]
		
		
		//10개 배열에 1~5로 이루어진 배열 생성
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//중복값이 제거된 배열 만들기
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