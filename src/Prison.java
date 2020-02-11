import java.util.Arrays;
public class Prison {
    public static void main(String args[]){
        int[] cells = new int[]{1,0,0,1,0,0,1,0};
        cells = prisonAfterNDays(cells,7);
        /*for(int i=0 ; i < cells.length; i++){
            System.out.print(cells[i]+",");

         */
        System.out.println(Arrays.toString(cells));
    }
    public static int[] prisonAfterNDays(int[] cells, int N) {
        int[] newCells = new int[cells.length];
        Arrays.fill(newCells, 0);
        for(int cir = 0; cir < N; cir++){
            for(int i=1; i < cells.length-1; i++){
                if((cells[i-1] == 0 && cells[i+1] == 0) ||(cells[i-1] == 1 && cells[i+1] == 1)){
                    newCells[i] = 1;
                }
            }
            cells = newCells.clone();
            Arrays.fill(newCells, 0);
        }
        return cells;
    }
}
