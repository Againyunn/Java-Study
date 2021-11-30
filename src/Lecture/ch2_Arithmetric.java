package Lecture;
import java.util.Scanner;


//Arithmetric을 ch1_Arithmetric으로 변경 -> 쉽게 식별하고 검색하기 위한 용도

public class ch2_Arithmetric {


    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public int sub(int num1, int num2)
    {
        return num1 - num2;
    }
    public int mul (int num1, int num2)
    {
        return num1 * num2;
    }
    public int div(int num1, int num2)
    {
        return num1 / num2;
    }


    public static void main(String[] args ) {
        //함수 사용 --> func 선언
        ch2_Arithmetric func = new ch2_Arithmetric();

        //변수 선언 --> 사칙연산 선택 번호입력 , 계산 할 변수 , 계산 결과
        int input;
        int num1 = 0, num2 = 0;
        int result = 0;
        while (true) {
            System.out.println("=== Elementary arithmetic");
            System.out.println("==> 0:Quit 1:Add(+) 2: Sub(--) 3:Mul(*) 4:Div(/)");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select?");
            input = scanner.nextInt();
            switch (input) {
                case 0:
                    System.out.println("=>0: Exit the Program!");
                    // return은 반환도 되지만 종료로도 쓰입니다
                    return;
                case 1: {
                    System.out.println("=>1: Start the addition program.");
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the number : ");
                    num2 = scanner.nextInt();
                    result = func.add(num1, num2);
                    System.out.println("=>Result: " + num1 + " + " + num2 + " = " + "=" + result);
                    break;
                }
                case 2: {
                    System.out.println("=>2: Start the subtraction program.");
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the number: ");
                    num2 = scanner.nextInt();
                    result = func.sub(num1, num2);
                    System.out.println("=>Result: " + num1 + "-" + num2 + " = " + result);
                    break;
                }
                case 3: {
                    System.out.println("=>3: Start the multiplication program.");
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the number: ");
                    num2 = scanner.nextInt();
                    result = func.mul(num1, num2);
                    System.out.println("=>Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                }
                case 4: {
                    System.out.println("=>4: Start the division program.");
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the number: ");
                    num2 = scanner.nextInt();
                    result = func.div(num1, num2);
                    System.out.println("=>Result: " + num1 + " / " + num2 + " = " + result);
                    break;
                }
                default:
                    System.out.println("==> " + input + ">> Invalid Number, Try again!");
                    break;
            }
            System.out.println("=====================================================");
            System.out.println();
        }
    }
}