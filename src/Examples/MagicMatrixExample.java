package Examples;

import Structures.Physics.UniversePhysics.ElemenetaryParticlePhysics;
import Structures.Verse;

public class MagicMatrixExample extends BasicMagicUniverseExample {
    private Verse universe;

    public MagicMatrixExample(ElemenetaryParticlePhysics physics, int size, ElemenetaryParticlePhysics simulatedPhysics, int size2) {
        super(physics, size);
        universe = new BasicMagicUniverseExample(simulatedPhysics, size2);
    }

    @Override
    public void doOneClick() {
        super.doOneClick();
        universe.doOneClick();
        //do something bewteen them
        //behold neo !
    }
}
