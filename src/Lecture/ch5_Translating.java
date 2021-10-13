package Lecture;
import java.util.*;

public class ch5_Translating {
    public static void main(String[] args ) {
        String[][] words = new String[][]{
                {"hufs" , "한국외국어대학교"},
                {"opp", "객체지향프로그래밍"},
                {"os", "운영체제"},
        };

        Scanner scan = new Scanner(System.in);

        for (int i =0; i< words.length; i++){
            System.out.println("문제: "+words[i][0]+" 번역하시오.");
            String tmp = scan.next();

            if(tmp.equals(words[i][1])){
                System.out.println("정답!");
            }
            else{
                System.out.println("오답! 정답은 "+words[i][1]+" 입니다.");
            }
        }
        scan.close();
    }

}


