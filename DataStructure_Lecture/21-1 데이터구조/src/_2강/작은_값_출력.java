��;
import java.util.*;
public class ����_��_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.print("������ ���� �Է��ϼ���: ");
		Scanner input=new Scanner(System.in); //����ڷκ��� ���� �Է� ����
		int num=input.nextInt();
		int []result=new int[num]; //���� �Է� ���� �� �迭 
		
		for(int i=0; i<num;i++) //����ڷκ��� �Է¹��� ���� �迭�� �߰�
		{
			System.out.print(i+"��° ���Ҹ� �Է��ϼ���: ");
			Scanner input2 = new Scanner(System.in);
			int j=input2.nextInt();
			result[i]=j;
		}
		
		int min=result[0];//min�� �ʱⰪ���� result�� ù ���� �߰�
		for(int j=1; j<num; j++)
		{
			if (min>result[j]) //Ư�����Ұ� min���� ���� ��
				{
					min=result[j]; //mim�� Ư������ ������ ����
				}
		}
		System.out.println("�ּ� ���� : "+min);
		
	}

}
