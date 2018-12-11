package Examples;

import Physics.BasePhysics.Universe;
import Examples.BasicExamples.BasicMagicUniverse;
import Physics.MultiversePhysics.UniversesInteractPhysics;

import java.util.ArrayList;
import java.util.List;

public class MagicUniversesInteract implements UniversesInteractPhysics {
    private static MagicUniversesInteract instance;

    private MagicUniversesInteract() {
    }

    public static MagicUniversesInteract getPhysics() {
        if (instance == null)
            instance = new MagicUniversesInteract();
        return instance;
    }

    @Override
    public List<Universe> interact(Universe universe1, Universe universe2) {
        ArrayList<Universe> ret = new ArrayList<>();
        ret.add(universe1);
        ret.add(universe2);

        if (universe1 instanceof BasicMagicUniverse && universe2 instanceof BasicMagicUniverse) {
            int newMamount = ((BasicMagicUniverse) universe1).getMagicAmount() + ((BasicMagicUniverse) universe2).getMagicAmount() / 2;
            ((BasicMagicUniverse) universe1).setMagicAmount(newMamount);
            ((BasicMagicUniverse) universe1).setMagicAmount(newMamount);
        }
        return ret;
    }
}
