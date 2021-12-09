package Lecture;

public class ch9_Ball extends ch9_Circle {
    private String color;

    public ch9_Ball(String color) {
        this.color = color;
    }

    public void findColor() {
        System.out.println("공은 " + color + "이다.");
    }

    public void findArea() {
        findRadius();

        super.findArea();
        // super.secret();

        System.out.println("넓이: " + 4*pi*radius*radius + " (4*(π*반지름*반지름))");
    }

    public void findVolume() {
        double result = Math.pow(10, 3); // 10의 제곱

        System.out.println("부피: " + 4/3*pi*result +" (4/3*(π*반지름*반지름*반지름))");
    }
}