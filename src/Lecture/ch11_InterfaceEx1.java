package Lecture;


public class ch11_InterfaceEx1 {
    public static void main(String[] ar) {
        Car car = new Car();
        Trunk trunk = new Trunk();

        car.open();
        car.close();

        trunk.open();
        trunk.close();

        car.White();
        car.Black();
    }
}

interface OpenClose {
    public void open();
    public void close();
}

interface CarColor {
    public void White();
    public void Black();
}

class Car implements OpenClose , CarColor {
    @Override
    public void open() {
        System.out.println("차량 문 열림");
    }

    @Override
    public void close() {
        System.out.println("차량 문 닫힘");
    }

    @Override
    public void White() {
        System.out.println("차량 색상은 백색입니다.");
    }

    @Override
    public void Black() {
        System.out.println("차량 색상은 검정색입니다.");
    }
}

class Trunk implements OpenClose {
    @Override
    public void open() {
        System.out.println("트렁크 열림");
    }

    @Override
    public void close() {
        System.out.println("트렁크 닫힘");
    }
}
