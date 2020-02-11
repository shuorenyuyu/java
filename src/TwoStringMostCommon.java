public class TwoStringMostCommon {
    public static void main(String args[]){
        String s1 = "ABCABCABC";
        String s2 = "ABCABC";
        System.out.println(maxCommon(s1,s2));
    }
    private static String maxCommon(String s1, String s2){
        if(s2.length() > s1.length()){
            String temp = s2;
            s2 = s1;
            s1 = temp;
        }
        if(s1.contains(s2) && made(s1,s2)){
            return s2;
        }
        String res = "";
        for(int i=0; i < s2.length(); i++){
            String temp = s2.substring(i);
            if(made(s1,s2.substring(i))){
                res = temp;
            }
        }
        return res;
    }
    private static boolean made(String s1, String s2){
        int n = s1.length()/s2.length();
        if(s1.length()%s2.length() != 0) return false;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < n; i++){
           sb.append(s2);
        }
        return s1.equals(sb.toString());
    }
}
