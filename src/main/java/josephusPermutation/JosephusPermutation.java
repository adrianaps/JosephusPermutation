package josephusPermutation;

public class JosephusPermutation {
    public static int[] josephus(int[] soldiers, int killed) {
        if(soldiers.length <= 2 && killed % 2 != 0 || killed <= 1){
            return soldiers;
        }

        int aux=soldiers[killed-1];
        System.arraycopy(soldiers, 0, soldiers, 1, soldiers.length - 1);
        soldiers[0]=aux;
        return soldiers;
    }
}
