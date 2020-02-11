import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 2.题目2：输入两组字符串数组A、B，把他们合并成由结构
 {
 Value:””
 AExist：int,
 BExist：int
 } 组成的新数组输出，其中结构中Value表示该位置合并后的值， AExist，BExist代表合并后的该位置在原A，B数组中的索引位置，如果在原数组中不存在，对应索引项填入-1

 合并规则：
 1、A，B数组中相同的值相合并，数组中各个位置的值只在合并中使用一次
 如：A=[“a”,”a”] B=[“a”]
 合并后的数组为：
 [
 {Value:”a”, AExist:0, BExist:0},
 {Value:”a”, AExist:1, BExist:-1}
 ]
 2、最终合并结果在以A数组优先的前提下，数组左侧的值优先于右侧值被合并
 如：A=[“a”,”b”] B=[“c”,”b”]
 合并后数组为：
 [
 {Value:”a”, AExist:0, BExist:-1},
 {Value:”b”, AExist:1, BExist:1},
 {Value:”c”, AExist:-1, BExist:0}
 ]

 综合举例：
 A = [“a”,”b”,”c”,”h”,”k”]
 B = [“a”,”c”,”m”,”b”]

 合并后结构：
 [
 {Value:”a”, AExist:0, BExist:0},
 {Value:”b”, AExist:1, BExist:3},
 {Value:”c”, AExist:2, BExist:1},
 {Value:”h”, AExist:3, BExist:-1},
 {Value:”k”, AExist:4, BExist:-1},
 {Value:”m”, AExist:-1, BExist:2},
 ]
 */
public class exam {
    private static ArrayList<Node> list;
    private static ArrayList<Node> res;
    public static void main(String args[]){
        String[] A = new String[]{"a","b","c","h","k"};
        String[] B = new String[]{"a","c","m","b"};
        merge(A,B);
        for(int i=0 ; i < list.size(); i++){
            System.out.println("{ Value: "+list.get(i).val + ", AExist:" + list.get(i).AExist+", BExist:" + list.get(i).BExist+ " }");
        }
    }
    private static void merge(String[] s1, String[] s2){
        list = new ArrayList<>();
        res = new ArrayList<>();
        HashMap<String,Node> map = new HashMap<>();

        for(int i=0; i < s1.length; i++){
            Node temp = new Node(s1[i],i,-1);
            list.add(temp);
            map.put(s1[i],temp);
        }
        for(int i=0; i < s2.length; i++){
            Node temp = new Node(s2[i],-1,i);
            if(map.containsKey(s2[i])){
                Node node = map.get(s2[i]);
                int index = node.AExist;
                temp = new Node(s2[i],index,i);
                //set
                list.set(map.get(s2[i]).AExist,temp);
                continue;

            }
                list.add(temp);
        }


    }
    static class Node{
        String val;
        int AExist;
        int BExist;
        Node(String val,int AExist, int BExist){
            this.val = val;
            this.AExist = AExist;
            this.BExist = BExist;
        }
    }
}
