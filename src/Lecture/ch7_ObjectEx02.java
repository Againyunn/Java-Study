package Lecture;

public class ch7_ObjectEx02 {

    static class ClassTest {
        int x = 1;
        static int y = 20;
    }

    public static void main(String[] args) {
        ClassTest class1 = new ClassTest();
        ClassTest class2 = new ClassTest();

        class1.x = 5;
//		class2.x = 10;`

        System.out.println("x 값 변경 후");

        System.out.println("class1의 x: " + class1.x + ",  y: " + class1.y);
        System.out.println("class2의 x: " + class2.x + ",  y: " + class2.y);

        class1.y = 100;

        System.out.println("y 값 변경 후");

        System.out.println("class1의 x: " + class1.x + ",  y: " + class1.y);
        System.out.println("class2의 x: " + class2.x + ",  y: " + class2.y);
    }


}
