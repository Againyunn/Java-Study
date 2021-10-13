package Lecture;

public class ch3_DataType {
    public static void main(String[] args) {
        byte num1 = 'A';
        int result;
        short char1 = '@';
        char char2 = 66;
        char char3 = '\u0042';
        long num2 = 9876543210L;
        
        
        // format으로 출력
        // %d 정수, %c 문자, %s 문자열, %f 실수 \n 한줄 띄기
        System.out.printf("num1 숫자: %d \n", num1);
        System.out.printf("num1 문자: %c \n", num1);
        System.out.printf("char1 숫자: %d \n", char1);
        System.out.printf("char2 문자: %c \n", char2);
        System.out.printf("char3 문자: %c \n", char3);
        System.out.printf("num2 숫자: %d \n", num2);

        result = num1 + 100;
        System.out.println("num1 + 100 = " + result);

    }
}
