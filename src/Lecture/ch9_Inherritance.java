package Lecture;

public class ch9_Inherritance {
    public static void main(String[] args) {
        ch9_Circle c1 = new ch9_Circle();
        ch9_Ball c2 = new ch9_Ball("파란색");

        System.out.println("[ Circle ]");
        c1.findRadius();
        c1.findArea();

        System.out.println("\n[ Ball ]");
        c2.findRadius();
        System.out.println();
        c2.findColor();
        c2.findArea();
        c2.findVolume();
    }
}
