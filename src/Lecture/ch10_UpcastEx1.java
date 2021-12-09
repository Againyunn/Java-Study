package Lecture;

public class ch10_UpcastEx1 {
    public static void main(String[] args) {
        ch10_School sch =null;

        ch10_Student s1 = new ch10_Student();
        ch10_Student s2 = (ch10_Student) sch;

        sch = s1;
        ch10_Student s3 = (ch10_Student) sch;

        sch.num = 10;
        sch.test1();
        sch.test2();

        s1.num = 20;
        s1.test1();
        s1.test2();
    }
}
