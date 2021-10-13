package Lecture;
import java.util.*;

public class ch2 {
    public static void main(String[] args){
        System.out.println("Hello Java");

        System.out.println("input two numbers to <add>");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        int num2 = scan2.nextInt();
        int answer=add(num1,num2);
        System.out.println(answer);
    }

    public static int add(int a, int b)
    {
        return a +b;
    }
}