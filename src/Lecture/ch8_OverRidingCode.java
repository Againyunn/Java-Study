package Lecture;

public class ch8_OverRidingCode {
    public static void main(String[] args) throws Exception{

        ch8_University hufs = new ch8_University();

        hufs.className = "홍길동";
        hufs.subjectTime = 3;
        hufs.subjectName = "객체지향프로그래밍";

        hufs.print();
    }
}
