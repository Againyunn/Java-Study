package 연습;

public class Knapsack {
    public static long []buffer = new long[100];
    public static int [][] memo = new int[6][12];

    public static int [] v = { 1, 6, 18, 22, 28 }; //가치
    public static int [] w = { 1, 2, 5, 6, 7 }; //무게



    public static int Knapsack1 ( int i, int W) //재귀를 이용
    {
        //여기서 W는 현재 가방에 남아있는 여유 공간의 크기가 됨, i는 보석을 어디서부터 고려해야하는지 지정한 값임

        if (i < 0) //더 이상 고려할 보석이 없을 때
            return 0;

        if (w[i] > W) //현재 보석의 무게가 남아있는 가방 무게 W보다 클 경우
            return Knapsack1(i-1, W);

        return Math.max(Knapsack1(i-1,W), Knapsack1(i-1,W-w[i])+v[i]);
        //바꾸지 않았을 경우 혹은 바꾼 경우의 최댓값을 return 함
    }

    public static int Knapsackbu( int n, int W, int []w, int[]v)
    {
        for(int i =1; i <= W; i++)
        {
            memo[0][W] =0;
        }

        for(int i=1; i<= n; i++)
        {
            for(int j=1; j<=W; j++)
            {
                if (w[i] > j) {
                    memo[i][j] = memo[i - 1][j];
                    //System.out.println("memo["+i+"]["+W+"]:" + memo[i][W]);
                }
                else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i - 1][j - w[i]] + v[i]);
                    //System.out.println("memo["+i+"]["+W+"]:"+memo[i][W]);
                }
            }
        }
        return memo [n][W];
    }


    public static int Knapsack2 (int i, int W) //겹치는 부분을 memoization으로 변환
    {// top down

        if (i < 0) //더 이상 고려할 보석이 없을 때
            return 0;

        if(memo[i][W] !=0)
            return memo[i][W];

        if (w[i] > W) //현재 보석의 무게가 W보다 클 경우

            memo[i][W] = Knapsack2(i-1,W);
        else
            memo[i][W] = Math.max(Knapsack2(i-1,W), Knapsack2(i-1,W-w[i])+v[i]);

        return memo [i][W];
    }


    public static void main (String[] args) //문제 분석
    {
        int W = 11;
        int result = Knapsackbu(4, W, w, v);

        System.out.println(result);
    }

}