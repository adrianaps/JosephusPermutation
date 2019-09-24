package josephusPermutation;

public class JosephusPermutation {

    public static int[] josephus(int[] soldiers, int killed) {
        if(soldiers.length == 2 && killed % 2 != 0 || killed <= 1 || soldiers.length < 2) return soldiers;

        if(soldiers.length <= 3) return permutateKilledSoldier(soldiers, killed-1, 0);

        for(int i=0; i<soldiers.length-1; i++){
            soldiers = permutateKilledSoldier(soldiers, i+1+((soldiers.length-i)%killed), i);
        }
        return soldiers;
    }

    private static int[] permutateKilledSoldier(int[] soldiers, int killedSoldier, int liveSoldier) {
        int deadSoldier=soldiers[killedSoldier];
        System.arraycopy(soldiers, liveSoldier, soldiers, liveSoldier+1, killedSoldier-liveSoldier);
        soldiers[liveSoldier]=deadSoldier;
        return soldiers;
    }


}
