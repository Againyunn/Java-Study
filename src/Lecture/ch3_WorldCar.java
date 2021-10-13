package Lecture;

public class ch3_WorldCar {
    public static void main(String[] args) {
        System.out.println("Santafe width : "+ Santafe.width);
        System.out.println("Santafe height : "+Santafe.height);

        //Gasoline 인스턴스
        Santafe Gasoline = new Santafe();
        Gasoline.color = "white";
        Gasoline.price = 40000000;

        //Diesel 인스턴스
        Santafe Diesel = new Santafe();
        Diesel.color = "black";
        Diesel.price = 45000000;

        System.out.println("Gasoline은 "+Gasoline.color+","+Gasoline.price+
                "원이며,크기는 "+Gasoline.width+","+Gasoline.height+"입니다.");
        System.out.println("Diesel은 "+Diesel.color+","+Diesel.price+
                "원이며,크기는 "+Diesel.width+","+Diesel.height+"입니다.");

        Gasoline.width = 1900;
        Gasoline.height = 1685;
        System.out.println("Gasoline의 width를 1900 height를 1685로 변경");
        System.out.println("Gasoline은 "+Gasoline.color+","+Gasoline.price+
                "원이며,크기는 "+Gasoline.width+","+Gasoline.height+"입니다.");
        System.out.println("Diesel은 "+Diesel.color+","+Diesel.price+
                "원이며,크기는 "+Diesel.width+","+Diesel.height+"입니다.");

    }
}

//클래스 변수
class Santafe{
    String color;
    int price;
    static int width = 2000;
    static int height = 1500;
}
