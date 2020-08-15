public class NumToHex {
    public static void main(String args[]) {
        System.out.print(helper(100));
    }

    public static String helper(int num) {
        char[] map = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int mask = 16;
        StringBuilder sb = new StringBuilder();
        while(num > 16){
            int i = num%16;
            sb.append(map[i]);
            num /= 16;
        }
        sb.append(num);
        return sb.reverse().toString();

    }
}
