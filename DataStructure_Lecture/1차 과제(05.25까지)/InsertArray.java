��;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A= {5,3,8,1,2,7}; //�迭 ���� 5,3,8,1,2,7 ������ ���� ����
		
		for(int i=1; i<A.length; i++) //key(�� ��ü)�� �� �� ������ �ε��� ���� ����(�ι�° ���Һ��� key ���� ����)
		{
			int key = A[i]; 
			int j = i-1; //key�� �񱳸� �� ��(or ������ ���ĵ� ����)�� ���� �ε����� ������ ������ ���� j
			
			while(j>=0 && A[j]>key)//j��° �ε����� ���� > key�϶�, ù��° index(0)���� key�ε��� �������� ���� ���������� ȣ���ϱ� ���� �ڵ�
			{
				A[j+1] = A[j]; 
				j=j-1; 
			}
			A[j+1] = key; // ������ key �� ����
		}
		
		for(int k = 0; k < A.length; k++) //�迭 A�� �������ĵ� ���ҵ��� �������� ���
		{
			System.out.println(A[k]);
		}
	}
}
