package josephusPermutation;

public class JosephusPermutation {

    public static int[] josephus(int[] soldiers, int killed) {
        if(killed <= 1 || soldiers.length==1) return soldiers;
        return getKilledSoldiers(soldiers, killed);
    }

    private static int[] getKilledSoldiers(int[] soldiers, int killed) {
        int[] res = new int[soldiers.length];
        for (int i = 1, pos = 0 , count = 1; i <= soldiers.length ; i++, count++) {
            if(0 == count%killed) {
                res[pos] = soldiers[i-1];
                count=0;
                pos++;
            }
            if(pos != soldiers.length && i == soldiers.length){
                i=1;
            }
            if(pos == soldiers.length - 1){
                res[pos] = soldiers[i-1];
                break;
            }
        }
        return res;
    }
}
