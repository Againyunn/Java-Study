package Lecture;

public class ch9_Circle {
    double radius = 10.0, pi = 3.14;

    private void secret() {
        System.out.println("내는 비밀이야.");
    }

    protected void findRadius() {
        System.out.println("반지름: " + radius);
    }

    public void findArea() {
        System.out.println("면적: " + pi*radius*radius + " (π*반지름*반지름)");
    }
}
