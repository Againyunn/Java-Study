package 연습;

import java.util.Scanner;

public class SumTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countInput = scan.nextInt();
        int total = 0;

        for(int i = 1; i <= countInput; i++){
            total += i;
        }
        scan.close();

        System.out.println("total number:"+total);
    }
}
