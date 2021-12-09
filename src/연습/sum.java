package 연습;
import java.util.*;

public class sum {
    public static void main(String[] args) {

        System.out.print("계산할 수를 입력하세요."); //안내글

        Scanner scan = new Scanner(System.in); //Scanner로 Int입력 받기
        int max_num = scan.nextInt();

        int result =0 ; //합을 담을 변수
        for(int i=1;i<=max_num;i++){ //1~ 입력받은 Int까지 +1 연산
            result+=i;
        }
        System.out.println(result); //결과반환
    }
}
