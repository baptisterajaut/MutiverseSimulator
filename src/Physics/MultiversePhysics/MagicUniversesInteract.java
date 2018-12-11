package Physics.MultiversePhysics;

import Physics.BasePhysics.Universe;
import Physics.Basic.BasicMagicUniverse;

import java.util.ArrayList;
import java.util.List;

public class MagicUniversesInteract implements UniversesInteractPhysics {
    @Override
    public List<Universe> interact(Universe universe1, Universe universe2) {

        int newMamount = ((BasicMagicUniverse) universe1).getMagicAmount() + ((BasicMagicUniverse) universe2).getMagicAmount() / 2;
        ((BasicMagicUniverse) universe1).setMagicAmount(newMamount);
        ((BasicMagicUniverse) universe1).setMagicAmount(newMamount);
        ArrayList<Universe> ret = new ArrayList<>();
        ret.add(universe1);
        ret.add(universe2);
        return ret;
    }
    private static MagicUniversesInteract instance;

    private MagicUniversesInteract() {
    }

    public static MagicUniversesInteract getPhysics() {
        if (instance == null)
            instance = new MagicUniversesInteract();
        return instance;
    }
}
