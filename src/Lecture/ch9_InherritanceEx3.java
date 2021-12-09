package Lecture;

class A {
    public String x() {
        return "한국외국어대학교";
    }
}

class B extends A {
    public String x() {
        return "HUFS";
    }

    public String y() {
        return "OOP";
    }
}

public class ch9_InherritanceEx3 {
    public static void main(String[] args){
        B word = new B(); //A로 정의하게 되면 y는 선언되지 않았기때문에 인식하지 못한다.(에러 발생)
        System.out.println(word.x());
        System.out.println(word.y());
    }
}