import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**实现一个函数，函数输入为一个文件路径描述的数组，函数输出为对该数组转换后形成的指定的树状结构。

 输入范例：
 [
 “/diskC/folderA/test_file”,
 “"/diskC/folderA/sub_folderX/file1"”,
 “/diskKH/folderA/test_file”,
 “/diskC/folderB/folderC/fileX”
 ]
 对上述路径规则说明如下：
 ·所有路径都视为绝对路径，以“/”开始，且各路径层都以一个“/”分隔，不存在“//”这种空名称的层
 ·与电脑的文件系统的路径概念一样，树的单独各层里，同一层下的文件夹名称重复时，视为同一个文件夹
 上述输入转成树型结构后的输出如下：
 [{
    Name:”diskC”,
    Children:[{
        Name:”folderA”,
        Children:[{
            Name:”test_file”
        },{
            Name:”sub_folderX”,
            Children:[{
                Name:”file1”
        }]
    }]
 },{
    Name:”folderB”,
    Children:[{
        Name:”folderC”,
        Children:[{
            Name:”fileX”
        }]
    }]
 }]
 },{
    Name:”diskKH”,
    Children:[{
        Name:”folderA”,
        Children:[{
            Name:”test_file”
         }]
    }]
 }]
 *
 */
public class exam2 {
    public static void main(String args[]){
        String [] A = new String[]{"/diskC/folderA/test_file", "/diskC/folderA/sub_folderX/file1", "/diskKH/folderA/test_file", "/diskC/folderB/folderC/fileX"};
        HashMap<String, TreeNode> map = new HashMap<>();

        for(int i=0; i < A.length; i++){
            String[] temp = A[i].split("\\/");
            if(map.containsKey(temp[0])){
                TreeNode node = addToTree(temp,map.get(temp[0]));
                printTree(node);
                continue;
            }
            TreeNode root = newTree(temp);
            map.put(temp[0],root);
            printTree(root);
           /*for(int j=0; j < temp.length; j++){
               System.out.println(temp[j]);
           }
            */
        }
    }
    private static TreeNode newTree(String[] arr){
        TreeNode root = new TreeNode(arr[0]);
        TreeNode node = root;
        for(int i=1; i < arr.length; i++){
            TreeNode temp = new TreeNode(arr[i]); // temp for a tree node child
            node.children.add(temp);
            node = node.children.get(node.children.size()-1);
        }
        return root;
    }

    private static TreeNode addToTree(String[] arr,TreeNode node){
        TreeNode root = node;
        for(int i=1; i < arr.length; i++){
            List<TreeNode> list = node.children;
            if(list.contains(arr[i])){
                for(int index = 0; index < list.size(); index++){
                    if(list.get(index).name == arr[i]){
                        node = node.children.get(index);
                    }
                }
            }else{
                TreeNode temp = new TreeNode(arr[i]); // temp for a tree node child
                node.children.add(temp);
                node = node.children.get(node.children.size()-1);
            }
        }
        return root;
    }
    private static void printTree(TreeNode root){

        System.out.println("name:  "+root.name);
        List<TreeNode> list = root.children;
        for(int i=0; i < list.size(); i++){
            System.out.println("Children   :"+list.get(i).name);
            printTree(root.children.get(i));
        }
    }
    static class TreeNode{
        List<TreeNode> children = new ArrayList<>();
        String name;
        TreeNode(String name){
            this.name = name;
        }
    }
}
