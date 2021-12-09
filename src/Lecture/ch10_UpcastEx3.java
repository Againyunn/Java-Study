package Lecture;


class Tire {
    public String roll() {
        return("사계절 타이어");
    }
}

class ATire extends Tire {
    @Override
    public String roll() {
//      문제1> 클래스 Tire의 return 값을 출력하라.
        //코드 시작
        Tire t = new Tire();
        System.out.println(t.roll()); //메모리 주소가 참조된다.
        //코드 끝
        return("스포츠 타이어");
    }
}

class BTire extends Tire {
    @Override
    public String roll() {
        return("스노우 타이어");
    }

    public String rolls() {
        return("재생 타이어");
    }
}

public class ch10_UpcastEx3 {
    public static void main(String[] args) {
//        문제2> ATire 클래스를 (   )캐스팅하여 부모 클래스이의 참조 변수 tire1에 저장한다.
        Tire tire1 = new ATire();
        Tire tire2 = new BTire();

        System.out.println(tire1.roll());
        System.out.println(tire2.roll());

//        문제3> 재생 타이어를 출력하라.

        BTire tire3 = new BTire();
        System.out.println(tire3.rolls());
    }
}
