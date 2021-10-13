package Lecture;

public class ch5_Array3D_Practise {
    public static void main(String[] args) {
        int[][][] ary = new int[2][4][3];
        int i,j,k=11;

        for (i=0; i<ary.length; i++)
            for(j=0; j<ary[i].length; j++)
                for(k=0; k<ary[i][j].length; k++){
                    ary[i][j][k] = i+1;
                }

        for(i=0; i<ary.length; i++){
            System.out.println((i+1)+"면 2차원 배열");
            for(j=0; j<ary[i].length; j++){
                for(int val: ary[i][j])
                    System.out.print(val + "\t");
                System.out.println();
            }
            System.out.println();
        }

    }
}
