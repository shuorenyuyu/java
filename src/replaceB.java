public class replaceB {

    public static void main(String args[]) {
        String s = "We are happy here";
        System.out.println(replace(s));
    }
    public static String replace(String s){
        StringBuffer sb =new StringBuffer();
        for(int i=0;i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                c = '%';
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
