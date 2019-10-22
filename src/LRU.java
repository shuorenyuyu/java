import java.util.HashMap;

class LRU{
    public static void main(String args[]){
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));      // returns -1 (not found)
        System.out.println(cache.get(3));      // returns 3
        System.out.println(cache.get(4));    // returns 4
    }
    static class Node{
        Node next;
        Node prev;
        int key;
        int val;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }

    static class LinkedNodeList{
        Node head;
        Node tail;
        LinkedNodeList(){
            head =new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
        }
        void moveToHead(Node node){
            node.next.prev=node.prev;
            node.prev.next=node.next;
            addToHead(node);
        }
        void addToHead(Node node){
           Node temp = head.next;
           head.next=node;
           node.next=temp;
           temp.prev=node;
           node.prev=head;
        }
        void removeTail(){
            Node temp = tail.prev.prev;
            temp.next=tail;
            tail.prev=temp;
        }
        Node getTail(){
            return tail.prev;
        }
    }
    static class LRUCache{
        int cap;
        HashMap<Integer,Node> map;
        LinkedNodeList list;
          LRUCache(int capacity){
            cap = capacity;
            map = new HashMap<>(cap);
            list = new LinkedNodeList();
        }
        int get(int key){
              Node node = map.get(key);
              if(node != null){
                  list.moveToHead(node);
                  return node.val;
              }
            return -1;
        }
        void put(int key,int value){
             Node node = map.get(key);
             if(node != null){
                 node.val = value;
                 map.put(key,node);
                 list.moveToHead(node);
             }else{
                 node = new Node(key,value);
                 if(map.size() == cap){
                     Node tail = list.getTail();
                     map.remove(tail.key);
                     list.removeTail();
                 }
                 list.addToHead(node);
                 map.put(key,node);
             }
        }
    }
}