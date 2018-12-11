package Simulation;

import Physics.BasePhysics.ElemenetaryParticlePhysics;
import Physics.BasePhysics.Universe;
import Examples.BasicExamples.BasicMagicUniverse;

public class MatrixExample extends BasicMagicUniverse {
    private Universe universe;

    public MatrixExample(ElemenetaryParticlePhysics physics, int size, ElemenetaryParticlePhysics simulatedPhysics, int size2) {
        super(physics, size);
        universe = new BasicMagicUniverse(simulatedPhysics, size2);
    }

    @Override
    public void doOneClick() {
        super.doOneClick();
        universe.doOneClick();
        //do something bewteen them
        //behold neo !
    }
}
