package josephusPermutation;

public class JosephusPermutation {

    public static int[] josephus(int[] soldiers, int killed) {
        if(soldiers.length == 2 && killed % 2 != 0 || killed <= 1 || soldiers.length < 2) return soldiers;

        if(soldiers.length <= 3) return permutateKilledSoldier(soldiers, killed-1, 0);

        int lastKilled=-1;
        for(int i=0; i<soldiers.length-1; i++){
            soldiers = permutateKilledSoldier(soldiers, (killed%(soldiers.length-i))+lastKilled, i);
            lastKilled = (killed%(soldiers.length-i))+lastKilled;
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
