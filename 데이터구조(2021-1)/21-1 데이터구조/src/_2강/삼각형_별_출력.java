package _2강;
import java.util.*; 

public class 삼각형_별_출력 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		int n = num.nextInt();
		String star = "*";
		int j=1;
		while( j<=n )
		{
		for(int i =1; i<=j; i++)
		{
			System.out.print(star);
		}
		j++;
		System.out.println();
		
		}
	}

}
