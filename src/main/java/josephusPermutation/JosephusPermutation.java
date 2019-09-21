package josephusPermutation;

public class JosephusPermutation {
    public static int[] josephus(int[] soldiers, int killed) {
        if(soldiers.length <= 2){
            return soldiers;
        }
        int aux=soldiers[2];
        for (int i = soldiers.length-1; i > 0 ; i--) {
            soldiers[i] = soldiers[i-1];
        }
        soldiers[0]=aux;
        return soldiers;
    }
}
