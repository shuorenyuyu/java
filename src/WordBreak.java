import java.util.ArrayList;

public class WordBreak {
    public static void main(String args[]){
        String s = "catsandog";
        ArrayList<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");
        System.out.println(wordBreak(list,s));
    }
    private static boolean wordBreak(ArrayList<String> list, String s){
        int len = s.length();
        boolean[] inDict = new boolean[len+1];
        inDict[0] = true;
        for(int i=0; i < len; i++){
            for(int j=i+1; j< len+1 && inDict[i]; j++){
                if(list.contains(s.substring(i,j))) inDict[j] = true;
            }
        }
        return inDict[len];
    }
}
