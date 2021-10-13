package Lecture;
import java.util.*;

public class ch4_TestPgm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String grade;
        System.out.println("한국외국어대학교 객체지향프로그래밍");
        System.out.print("성적을 입력하세요 : ");
        int score = in.nextInt();

        if (score >= 90)
            grade = "A";
        else {
            if (score >= 80)
                grade = "B";
            else {
                if (score >= 70)
                    grade = "C";
                else {
                    if (score >= 60)
                        grade = "D";
                    else
                        grade = "F";
                }
            }
        }
        System.out.println("해당 성적은 " + grade + " 입니다.");
    }
}
