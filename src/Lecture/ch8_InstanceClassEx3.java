package Lecture;

public class ch8_InstanceClassEx3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(99.0);
        Circle circle2 = new Circle(99.0);

        zero(circle1);
        System.out.println("Circle1의 Radius: " + circle1.radius);

        zero(circle2.radius);
        System.out.println("Circle2의 Radius: " + circle2.radius);
    }
}
