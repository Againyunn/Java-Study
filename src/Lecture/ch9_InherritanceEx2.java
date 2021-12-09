package Lecture;

class Animal {
    public Animal(String s) {
        System.out.println("동 물: " + s);
    }
}

class Bird extends Animal {
    public Bird() {
        super("비둘기");
        System.out.println("조 류: 비둘기");
    }

    public Bird(String s) {
        super(s);
        System.out.println("조 류: " + s);
    }
}

public class ch9_InherritanceEx2 {
    public static void main(String[] args) {
        Bird dove = new Bird();
        Bird eagle = new Bird("독수리");
    }
}