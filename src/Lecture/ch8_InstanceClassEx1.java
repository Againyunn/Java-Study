package Lecture;

public class ch8_InstanceClassEx1 {
    static int num_a = 100;
    int num_b = 100;

    public static void main(String[] args) {
        ch8_InstanceClassEx1 test1 = new ch8_InstanceClassEx1();
        ch8_InstanceClassEx1 test2 = new ch8_InstanceClassEx1();

        test1.num_a = 200;
        test2.num_a = 400;
        System.out.println("test1.num_a = " + test1.num_a);
        System.out.println("test2.num_a = " + test2.num_a);

        test1.num_b = 300;
        test2.num_b = 500;
        System.out.println("test1.num_b = " + test1.num_b);
        System.out.println("test2.num_b = " + test2.num_b);
    }
}
