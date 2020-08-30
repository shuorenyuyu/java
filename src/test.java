public class test {
    public static void main(String args[]){
        String s = "stackcollapse-p   23867 [007] 4762187.971824:   29003297 cycles:ppp:";
        List res = helper(s);
        System.out.print("["+res.command+","+res.pid+","+res.cpu+","+res.timestamp+","
                +res.value+","+res.event+"]");
    }
    public static List helper(String s){
        //String arrs[]  = s.split("stackcollapse-p");
        String arrs[] = s.split("\\s+");
        String command = arrs[0];
        String pid = arrs[1];
        String cpu = arrs[2];
        String timestamp = arrs[3];
        String value = arrs[4];
        String event = arrs[5];
        //String stack = arrs[7];
        List res = new List(command, Integer.valueOf(pid), Integer.valueOf(cpu),Double.valueOf(timestamp), Integer.valueOf(value),event);
        return res;
    }
    static class List{
        String command;
        int pid;
        int cpu;
        double timestamp;
        int value;
        String event;

        public List(String command, Integer valueOf, Integer valueOf1, Double valueOf2, Integer valueOf3, String event) {
        }

        // String stack;
        void List(String command, int pid, int cpu, double timestamp, int value, String event){
            this.command = command;
            this.pid = pid;
            this.cpu = cpu;
            this.timestamp = timestamp;
            this.value = value;
            this.event = event;
           // this.stack = stack;
        }
    }
}
