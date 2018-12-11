package Simulation;

import Physics.BasePhysics.Universe;
import Physics.Basic.Basic2DPhysics;
import Physics.Basic.Basic3DPhysics;
import Physics.Basic.BasicMagicUniverse;
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
        for (int i = 0; i < 5; i++) {
            for (Universe u1 : multiverse) {
                for (Universe u2 : multiverse) {
                    if (u1 == u2) continue;
                    u1.interactAll();
                    u2.interactAll();
                    multiversePhysics.interact(u1, u2);

                }
            }
        }
    }

}
