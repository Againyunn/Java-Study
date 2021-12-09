package Lecture;


class ch11_Animal {
    Cat i;

    void toC(Cat i) {
        this.i = i;
    }

    Cat toC1(Cat i) {
        this.i = i;
        return i;
    }

    void hangul() {
        i.CatName();
    }

    interface Cat{
        void CatName();
    }
}

class Run1 implements ch11_Animal.Cat {
    @Override
    public void CatName() {
        System.out.println("Cat: 야옹이");
    }
}

class Run2 implements ch11_Animal.Cat {
    @Override
    public void CatName() {
        System.out.println("Cat: 냐옹이");
    }
}

class Run3 implements ch11_Animal.Cat {
    @Override
    public void CatName() {
        System.out.println("Cat: 옹이");
    }
}

public class ch11_InterfaceEx2 {
    public static void main(String[] args) {

        ch11_Animal ani = new ch11_Animal();
        ani.toC(new Run1());
        ani.hangul();
        ani.toC(new Run2());
        ani.hangul();
        ani.toC(new Run3());
        ani.hangul();
    }
}