import java.util.ArrayList;

public class CharShowUp {
    static ArrayList<Character> list;
    public static void main(String args[]){
        String s = "loot, bool, gool";
        list = new ArrayList<>();
        helper(s);
        System.out.println(list);
    }
    public static void helper(String s){
        String[] arr = s.split("\\s+");
        for(int i=0; i < arr.length; i++){
            char c = arr[i].charAt(0);
            list.add(c);
        }
    }
}
