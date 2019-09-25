package josephusPermutation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JosephusPermutation {

    public static int[] josephus(int[] soldiers, int killed) {
        if(killed <= 1 || soldiers.length==1) return soldiers;

        return getKilledSoldiers(Arrays.stream(soldiers).boxed().collect(Collectors.toList()), killed);
    }

    private static int[] getKilledSoldiers(List<Integer> soldiers, int killed) {
        int[] deadSoldiers = new int[soldiers.size()];
        for (int i = 1, alreadyDead = 0 , count = 1; i <= soldiers.size() ; i++, count++) {
            if(count % killed == 0) {
                deadSoldiers[alreadyDead] = soldiers.remove(i-1);
                count=0;
                alreadyDead++;
                i--;
            }
            if(oneSoldierLeft(deadSoldiers.length, alreadyDead)){
                deadSoldiers[alreadyDead] = soldiers.remove(0);
                break;
            }
            if(areSoldiersStillAlive(soldiers.size(), deadSoldiers.length-1, i, alreadyDead)) i=0;

        }
        return deadSoldiers;
    }

    private static boolean oneSoldierLeft(int deadSoldiers, int alreadyDead) {
        return alreadyDead == deadSoldiers-1;
    }

    private static boolean areSoldiersStillAlive(int soldiersAlive, int deadSoldiers, int i, int pos) {
        return pos != deadSoldiers && i == soldiersAlive;
    }
}
