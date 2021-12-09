package Lecture;

abstract class School { //자식 클래스에 Abstract 클래스의 코드를 강제하기 위한 선언(강제성)
    abstract void dsp();
}

class University1 extends School{
    void dsp() {
        System.out.println("한국외국어대학교");
    }
}

class  University2 extends School{
    void dsp() {
        System.out.println("HUFS");
    }
}

class Subject extends School{
    void dsp() {
        System.out.println("객체지향프로그래밍");
    }
}

public class ch11_AbstractEx1 {
    public static void main(String[] args) {

        University1 u1 = new University1();
        University2 u2 = new University2();
        Subject s = new Subject();

        u1.dsp();
        u2.dsp();
        s.dsp();
    }
}