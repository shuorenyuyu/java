public class divideby {
    public static void main(String args[]){
        int N = 99991099;
        System.out.println(helper2(N) == helper1(N));
    }
    public static int helper1(int N){
        int res = (N+1)*N/2;
        for(int i=1;i<=N;i++){
            if(i % 3 ==0 || i % 7 == 0){
                res-= i;
            }
        }
        return res;
    }
    public static int helper2(int N){
        /* It's my O(1) solution. Because it asks that the result should be sum for 1-n, which remove total number
         for multiples of 3 and 7. But it would remove twice for 21,which is least common multiple for 3 and 7. So it
         will add back for the sum for 21.
         */
        int res = (N+1)*N/2;
        int num3 = N/3; //total number for multiples of 3
        int num7 = N/7; //total number for multiples of 7
        int num21 = N/21; //total number for multiples of 21
        int sum3 =(N/3)*(3+num3*3)/2; // sum for multiples of 3
        int sum7 = (N/7)*(7+num7*7)/2; //sum for multiple of 7
        int sum21 = (N/21)*(21+num21*21)/2; //sum for  multiple of 21

        return res - sum3 - sum7 + sum21;
    }
}



