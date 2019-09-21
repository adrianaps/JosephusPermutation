package josephusPermutation;

public class JosephusPermutation {
    public static int[] josephus(int[] soldiers, int killed) {
        int aux=soldiers[2];
        System.arraycopy(soldiers, 0, soldiers, 1, soldiers.length - 1);
        soldiers[0]=aux;
        return soldiers;
    }
}
