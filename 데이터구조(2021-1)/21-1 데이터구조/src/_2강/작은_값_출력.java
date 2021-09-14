package _2강;
import java.util.*;
public class 작은_값_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.print("원소의 수를 입력하세요: ");
		Scanner input=new Scanner(System.in); //사용자로부터 숫자 입력 받음
		int num=input.nextInt();
		int []result=new int[num]; //수를 입력 받을 빈 배열 
		
		for(int i=0; i<num;i++) //사용자로부터 입력받은 수를 배열에 추가
		{
			System.out.print(i+"번째 원소를 입력하세요: ");
			Scanner input2 = new Scanner(System.in);
			int j=input2.nextInt();
			result[i]=j;
		}
		
		int min=result[0];//min의 초기값으로 result의 첫 원소 추가
		for(int j=1; j<num; j++)
		{
			if (min>result[j]) //특정원소가 min보다 작을 때
				{
					min=result[j]; //mim을 특정원소 값으로 변경
				}
		}
		System.out.println("최소 값은 : "+min);
		
	}

}
