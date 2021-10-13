package Lecture;

public class ch4_TestPgm02 {
    public static void main(String[] args) {
        System.out.println("*구구단 출력*");
        for(int i=1;i<10;i++) {
            System.out.println("\n *"+i+"단*");

            for(int j=1;j<10;j++) {
                System.out.println(i + "*" + j +" = " + i*j);
//				System.out.printf("%d*%d = %d\n", i, j, i*j);
            }
        }
    }
}
