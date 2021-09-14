package _9강;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A= {5,3,8,1,2,7}; //배열 내의 5,3,8,1,2,7 순서로 원소 선언
		
		for(int i=1; i<A.length; i++) //key(비교 주체)가 될 매 차례의 인덱스 원소 지정(두번째 원소부터 key 지정 시작)
		{
			int key = A[i]; 
			int j = i-1; //key와 비교를 할 앞(or 기존에 정렬된 원소)의 원소 인덱스를 지정할 임의의 변수 j
			
			while(j>=0 && A[j]>key)//j번째 인덱스의 원소 > key일때, 첫번째 index(0)부터 key인덱스 전까지의 원소 순차적으로 호출하기 위한 코드
			{
				A[j+1] = A[j]; 
				j=j-1; 
			}
			A[j+1] = key; // 다음의 key 값 설정
		}
		
		for(int k = 0; k < A.length; k++) //배열 A의 삽입정렬된 원소들을 수직으로 출력
		{
			System.out.println(A[k]);
		}
	}
}
