package 연습;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {

        System.out.println("배열의 길이를 입력하세요.");
        System.out.print("총 인덱스 수 : ");

        Scanner scanNum = new Scanner(System.in);
        int num = scanNum.nextInt();

        //배열 길이 선언
        int[] arr = new int[num];

        //값 입력받기
        System.out.println("배열의 원소를 입력하세요.");
        for(int i = 0; i < num; i++){

            System.out.print("arr["+i+"] : ");
            Scanner arrElement = new Scanner(System.in);
            arr[i] = arrElement.nextInt();
        }

        System.out.println("현재 입력된 정렬 전 배열입니다.");
        //정렬 전 배열 출력
        for(int a = 0; a < num; a++){
            System.out.print(arr[a]+" ");
        }

       for(int j = 0; j < (arr.length -1); j++){
           for(int k = (arr.length - 1); k > j ; k--){
//            for(int k = 0; k < arr.length - j - 1; k++){
               if(arr[k] < arr[k - 1]){
//               if(arr[k] > arr[k+1]){

                    //중간 과정의 출력이 필요하다면
                    //1. 바꾸기 전
                    System.out.println("["+k+"]바꾸기 전:"+arr[k]);

                    int tmp = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = tmp;

                    //중간 과정의 출력이 필요하다면
                    //2. 비교해서 바꾼 후
                    System.out.println("["+k+"]바꾼 후:"+arr[k]);
                }
            }
        }

        System.out.println("버블 정렬 후 배열입니다.");
        //정렬 후 배열 출력
        for(int b = 0; b < num; b++){
            System.out.print(arr[b]+" ");
        }

    }
}
