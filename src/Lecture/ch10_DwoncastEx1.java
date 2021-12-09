package Lecture;

public class ch10_DwoncastEx1 {
    public static void main(String[] args) {
        ch10_School sch = new ch10_Student();

        sch.test1();

        ch10_School downc = (ch10_Student) sch;

        downc.test1();
    }
}
