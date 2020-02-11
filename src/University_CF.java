import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * For example, there are n = 5 companies that will arrive at times arrival = [1,3,3,5,7] and will stay for duration = [2,2,1,2,1]
 * The first company arrives at time 1 and stays for 2 hours. At time 3, two companies arrive, but only I can stay for either 1 or 2
 * hours. the next companies arrive at times and 5 and 7 do not conflict with each other, In total, there can be a maximum of 4 promotional
 * events.
 *
 * // UNIVERSITY CAREER FAIR
 * int[] arrival = {1, 2};
 * int[] duration = {7, 3}; // Output = 1
 *
 * // int[] arrival = {1, 3, 4, 6};
 * // int[] duration = {4, 3, 3, 2}; // Output = 2
 *
 * // int[] arrival = {1,3,3,5,7};
 * // int[] duration = {2,2,1,2,1}; // Output = 4
 *
 * // int[] arrival = {1,3,5};
 * // int[] duration = {2,2, 2}; // Output = 3
 */
public class University_CF {
    public static void main(String args[]){
        int[] arrival = new int[]{1,2};
        int[] duration = new int[]{7,3};

        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0; i < arrival.length; i++){
            map.put(arrival[i],duration[i]);
        }
        Map<Integer, Integer> sortedMap = map.entrySet().stream().sorted((o1, o2) ->
                (o1.getKey() + o2.getKey()) < (o1.getValue() + o2.getValue()) ? 1 : 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, HashMap::new));

        int max_Events = 0, end = 0;
        for (Map.Entry<Integer, Integer> i : sortedMap.entrySet()) {
            if (i.getKey() >= end) {
                ++max_Events;
                end = i.getKey() + i.getValue();
            }
        }
        System.out.println(max_Events);
    }
}
