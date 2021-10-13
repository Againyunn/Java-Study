package Lecture;

public class ch4_TestPgm03 {
    public static void main(String[] args) {
        int i = 100;

        //do-while문은 i를 먼저 실행한 뒤에 반복 시행
        do{
            i++;
        }while(i< 100);
        System.out.println("do-while 실행 : "+i);
    
        //while문은 반복을 돈 다음에 i를 실행
        i =100;
        while(i<100){
            i++;
        }
        System.out.println("while 실행 : "+i);
        
        
        //break문: 반복의 탈출
        //continue문: continue뒤의 코드를 무시하고 다음 반복 실행
    }
}
