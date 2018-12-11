package Examples;

import Structures.Physics.MultiversePhysics.Multiverse;
import Structures.Physics.MultiversePhysics.MultiversePhysics;
import Structures.Physics.UniversePhysics.BasicPhysicsExamples.Basic2DPhysics;
import Structures.Physics.UniversePhysics.BasicPhysicsExamples.Basic3DPhysics;

import java.util.ArrayList;

public class MultiverseExample extends Multiverse {
    private MultiversePhysics multiversePhysics;

    public MultiverseExample(MultiversePhysics physics) {
        super(physics);
        verses = new ArrayList<>();

        verses.add(new BasicMagicUniverseExample(Basic2DPhysics.getPhysics(), 5));
        verses.add(new BasicMagicUniverseExample(Basic3DPhysics.getPhysics(), 7));
        verses.add(new MagicMatrixExample(Basic2DPhysics.getPhysics(), 5, Basic3DPhysics.getPhysics(), 7));
    }


}
