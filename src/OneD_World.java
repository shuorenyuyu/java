import java.util.ArrayList;
import java.util.List;

/**

 Suppose you are in zero point in a 1-d World and you have a counter, if you go left / right, the counter +1 / -1.
 You must walk k steps and what is the probability of the counter being zero.
 */
public class OneD_World {
    public static void main(String args[]){
        int k = 10;
        System.out.println(back(k));
    }
    public static double back(int k){
        List<Integer> list = new ArrayList<>();
        helper(list,k,0,0);
        int count = 0;
        for(int i=0; i < list.size(); i++){
            if(list.get(i) == 0){
                count++;
            }
        }
        return (double) count/list.size();
    }
    private static void helper(List<Integer> list,int k, int pos,int i){
        if(i == k){
            list.add(pos);
            return;
        }
        helper(list,k,pos+1,i+1);
        helper(list,k,pos-1,i+1);
    }
}
