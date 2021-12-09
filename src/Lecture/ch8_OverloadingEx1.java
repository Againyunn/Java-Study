package Lecture;

public class ch8_OverloadingEx1 {
    public static void main(String[] args) {
        ch8_OverloadingEx1 t = new ch8_OverloadingEx1();
        t.box();
        t.box(100);
        t.box(100,200);
        t.box(100,300.1);
    }
    void box() {
        System.out.println("...box...");
    }
    void box(int i) {
        System.out.println(i);
    }
    void box(int i, int j) {
        System.out.println(i+j);
    }
    void box(int i, double k) {
        System.out.println(i+k);
    }
}
