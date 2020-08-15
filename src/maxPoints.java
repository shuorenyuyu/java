import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
public class maxPoints {
    public static void main(String args[]){
        int[][] A = new int[][]{{1,1},{1,1},{2,2},{2,2}};
        System.out.print(maxPoints(A));
    }
    public static int maxPoints(int[][] points) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                map.put(line(points[i], points[j]), map.getOrDefault(line(points[i], points[j]), 0) + 1);
                System.out.println(map.get(line(points[i], points[j])));
            }
        }
        int lines = Collections.max(map.values());
        int res = 0;
        for (int i = 1; i <= lines; i++) {
            lines = lines/i;
            //System.out.println(lines);
            if (lines == 1) {
                res = i + 1;
                break;
            }
        }
        return res;
    }
    public static String line(int[] A, int [] B){
        StringBuilder sb = new StringBuilder();
        if((B[0]-A[0]) == 0) return Integer.MAX_VALUE+","+A[0];
        int k = (B[1]-A[1])/(B[0]-A[0]);
        int b = A[1] - k*A[0];
        sb.append(k);
        sb.append(',');
        sb.append(b);
        return sb.toString();
    }
}
