package josephusPermutation;

public class JosephusPermutation {
    public static int[] josephus(int[] soldiers, int killed) {
        if(soldiers.length <= 2 && killed % 2 != 0 || killed == 0){
            return soldiers;
        }else if (soldiers.length <= 2){
            int aux = soldiers[0];
            soldiers[0] = soldiers[1];
            soldiers[1] = aux;
            return soldiers;
        }

        int aux=soldiers[2];
        System.arraycopy(soldiers, 0, soldiers, 1, soldiers.length - 1);
        soldiers[0]=aux;
        return soldiers;
    }
}
