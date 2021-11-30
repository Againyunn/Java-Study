package Lecture;

public class ch7_MyClass {
    public static void main(String[] args) {
        ch7_HankukUniv p1 = new ch7_HankukUniv();
        p1.lines = "-------------";
        p1.A();
        p1.B();

        ch7_HankukUniv p2 = new ch7_HankukUniv();
        p2.lines = "=============";
        p2.A();
        p2.B();

        p1.A();
        p2.A();
    }
}
