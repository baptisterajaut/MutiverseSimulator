package Examples;


import Structures.Physics.MultiversePhysics.MultiversePhysics;
import Structures.Verse;

import java.util.ArrayList;
import java.util.List;

public class MagicMultiversePhysicsExample implements MultiversePhysics {
    private static MagicMultiversePhysicsExample instance;

    private MagicMultiversePhysicsExample() {
    }

    public static MagicMultiversePhysicsExample getPhysics() {
        if (instance == null)
            instance = new MagicMultiversePhysicsExample();
        return instance;
    }

    @Override
    public List<Verse> interact(Verse universe1, Verse universe2) {
        ArrayList<Verse> ret = new ArrayList<>();
        ret.add(universe1);
        ret.add(universe2);

        if (universe1 instanceof BasicMagicUniverseExample && universe2 instanceof BasicMagicUniverseExample) {
            int newMamount = ((BasicMagicUniverseExample) universe1).getMagicAmount() + ((BasicMagicUniverseExample) universe2).getMagicAmount() / 2;
            ((BasicMagicUniverseExample) universe1).setMagicAmount(newMamount);
            ((BasicMagicUniverseExample) universe1).setMagicAmount(newMamount);
        }
        return ret;
    }
}
