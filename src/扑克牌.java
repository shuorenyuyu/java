import java.util.Random;

public class 扑克牌 {
    public static void main(String args[]){
        String[] cards = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        helper(cards);
        for(String s : cards){
            System.out.print(s+" ,");
        }
    }
    public static void helper(String[] A){
        Random r = new Random();
        for(int i=0; i < A.length; i++){
            int ran = r.nextInt(A.length-1)+0;
            String temp = A[A.length-1];
            A[A.length-1] = A[ran];
            A[ran] = temp;
        }

    }
}
