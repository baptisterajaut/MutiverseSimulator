package Simulation;

import Physics.BasePhysics.Universe;
import Examples.BasicExamples.Basic2DPhysics;
import Examples.BasicExamples.Basic3DPhysics;
import Examples.BasicExamples.BasicMagicUniverse;
import Physics.MultiversePhysics.UniversesInteractPhysics;

import java.util.ArrayList;

public class MagicMultiverseExample {
    private ArrayList<Universe> multiverse;
    private UniversesInteractPhysics multiversePhysics;

    public MagicMultiverseExample(UniversesInteractPhysics physics) {
        multiverse = new ArrayList<>();
        multiversePhysics = physics;
    }

    public void runThemAll() {
        multiverse.add(new BasicMagicUniverse(Basic2DPhysics.getPhysics(), 5));
        multiverse.add(new BasicMagicUniverse(Basic3DPhysics.getPhysics(), 7));
        multiverse.add(new MatrixExample(Basic2DPhysics.getPhysics(), 5, Basic3DPhysics.getPhysics(), 7));
        //matrixexamples simulate a more complex universe than themself
        for (int i = 0; i < 5; i++) {
            ArrayList<Universe> newVerse = new ArrayList<>(multiverse);
            for (Universe u1 : multiverse) {
                u1.doOneClick();
                for (Universe u2 : multiverse) {
                    if (u1 == u2) continue;
                    newVerse.remove(u1);
                    newVerse.remove(u2);
                    multiversePhysics.interact(u1, u2);

                }
            }
            multiverse = newVerse;
        }
    }

}
