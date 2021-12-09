package Lecture;


public class ch10_UpcastEx2 {
    public static void main(String[] args) {
        ch10_School sch = null;
        sch = new ch10_Student();

        sch.test1();
        sch.test2();
    }
}
