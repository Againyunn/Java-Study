package _2강;
import java.util.Scanner;

public class 사각형의_별표_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); // 사용자로부터 입력받은 num
		
		for(int i=1; i<=num;i++)//세로 줄 출력용
		{
			for(int j=1; j<=num; j++)//가로 줄 출력용
			{
				String s= "*";
				System.out.print(s);
			}
		System.out.println();
		}
	}

}
