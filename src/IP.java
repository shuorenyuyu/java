import java.util.HashMap;

public class IP {
    public static String res;
    public static void main(String args[]){
        String string = "192.0.0.255||195.0.0.123||192.255.0.1||192.0.0.255||192.0.0.255||195.0.0.123";
        System.out.println(helper(string));
        System.out.println(res);
    }
    public static int helper(String s){
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = s.split("\\|\\|");
        for(String temp: arr){
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        res = arr[arr.length-2];
        return map.get(res);
    }
}
