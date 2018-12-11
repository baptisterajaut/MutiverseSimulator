package Physics.MultiversePhysics;

import Physics.BasePhysics.Universe;
import Physics.Physics;

import java.util.List;

public interface UniversesInteractPhysics extends Physics {
    List<Universe> interact(Universe universe1, Universe universe2);

}
