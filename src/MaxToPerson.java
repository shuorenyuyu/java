public class MaxToPerson {
    public static void main(String args[]){
        int[] seats = new int[]{1,0,0,0,1,0,1};
        System.out.print(maxDistToClosest(seats));
    }

    public static int maxDistToClosest(int[] seats) {
        int max = 1;
        for(int i=0; i < seats.length; i++){
            if(seats[i]  == 0){
                max = Math.max(max,dis(seats,i));
            }
        }
        return max;
    }
    public static int dis(int[] seats, int i){
        int res = 1;
        int resL = Integer.MAX_VALUE, resR = Integer.MAX_VALUE;
        int l=i-1, r = i+1;
        while(l >= 0){
            if(seats[l] == 1){
                resL = res;
                break;
            }
            l--;
            res++;
        }
        res = 1;
        while(r < seats.length ){
            if(seats[r] == 1){
                resR = res;
                break;
            }
            r++;
            res++;
        }
        System.out.println(resL+"   "+ resR);
        return Math.min(resL,resR);
    }
}
