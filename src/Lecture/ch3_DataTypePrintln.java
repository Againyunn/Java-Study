package Lecture;

public class ch3_DataTypePrintln {
    public static void main(String[] args) {
        byte num1 = 'A'; //8비트 수
        int result;     //32비트 수
        short char1 = '@'; //16비트 수
        char char2 = 66;    //16비트 문자
        char char3 = '\u0042';
        long num2 = 9876543210L; // 64비트 수

        System.out.println("num1 숫자: " + num1);
        System.out.println("num1 문자: " + num1);
        System.out.println("char1 숫자: " + char1);
        System.out.println("char2 문자: " + char2);
        System.out.println("char3 문자: " + char3);
        System.out.println("num2 숫자: " + num2);

        result = num1 + 100;
        System.out.println("num1 + 100 = " + result);
    }
}
