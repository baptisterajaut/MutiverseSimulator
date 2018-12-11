package Examples;

import Examples.BasicPhysicsExamples.Basic2DPhysics;
import Examples.BasicPhysicsExamples.Basic3DPhysics;
import Structures.Physics.MultiversePhysics.Multiverse;
import Structures.Physics.MultiversePhysics.MultiversePhysics;

public class MultiverseExample extends Multiverse {


    public MultiverseExample(MultiversePhysics physics) {
        super(physics);

        verses.add(new BasicMagicUniverseExample(Basic2DPhysics.getPhysics(), 5));
        verses.add(new BasicMagicUniverseExample(Basic3DPhysics.getPhysics(), 7));
        verses.add(new MagicMatrixExample(Basic2DPhysics.getPhysics(), 5, Basic3DPhysics.getPhysics(), 7));
    }


}
