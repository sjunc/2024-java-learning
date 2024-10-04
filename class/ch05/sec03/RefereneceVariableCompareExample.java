package ch05.sec03;

public class RefereneceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스택?
		int[] arr1;			//배열 변수 arr1 선언
		int[] arr2;
		int[] arr3;

		// {}는 힙?
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1==arr2);		//arr1과 arr2 변수 값이 동일한 번지인지 검사
		System.out.println(arr2==arr3);		//arr2와 arr3 변수가 같은 배열을 참조하는지 검사
	}

}
