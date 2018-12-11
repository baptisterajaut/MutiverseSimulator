package Physics.MultiversePhysics;

import Physics.BasePhysics.Physics;
import Physics.BasePhysics.Universe;

import java.util.List;

public interface UniversesInteractPhysics extends Physics {
    List<Universe> interact(Universe universe1, Universe universe2);

}
