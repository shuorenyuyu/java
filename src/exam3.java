/**
 * m个面值的货币合成n最少个数
 * 1，2，5 ==>  6    11
 * 1 == 1     1
 * 2 == 2     1
 * 3 == 1,2   2
 * 4 == 2,2   2
 * 5 == 5     1
 * 6 == 5,1   2
 * 7 == 5,2   2
 * 8 == 5,2,1 3
 * 9 == 5,2,2 3
 * 10 == 5,5  2
 * 11 == 5,5,1 3
 *
 *
 * 1,4,5       8
 *
 */
public class exam3 {
    public static void main(String args[]){
        int[] arr = new int[]{1,4,5}; // coins
        int sum = 8;
        int[]dp=new int[sum+1];
        dp[0]=0;
        for(int i = 1; i <= sum; ++i)
        {
            for(int j = 0; j <= arr.length; ++j)
            { int a = 259575115;
                if(arr[j] <= i && dp[i - arr[j]] + 1 < dp[i]) {
                    dp[i] = dp[i - arr[j]] + 1;
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
