import java.util.ArrayList;
import java.util.HashMap;
/**
 * Find the factor
 * Determine all positive integer values that evenly divide into a number, its factors return the pth element of your list, sorted ascending.
 * If there is no pth element, return 0.
 * For example, given the number n = 20, its factors are {1,2,4,5,10,20}. Using 1-based indexing if p = 3, return 4. If p > 6, return 0.
 */
public class Find_the_factor {
    public static void main(String args[]){
        long n = 20;
        long p = 7;
        ArrayList<Long> res = find(n);
        if(p < res.size()){         //if the index is smaller than the list size
            System.out.println(res.get((int)p-1));  // print out
        }else{
            System.out.println(0);
        }
    }

    /** Function to help find all factors
     *
     * @param n: find all factors belong to n including itself
     * @return ArrayList res: contains all factors
     */
    private static ArrayList find(long n){
        ArrayList<Long> res = new ArrayList<>();
        for(long i=1 ; i <= n; i++){
            if(n %i == 0){
                res.add(i);
            }
        }
        return res;
    }
}