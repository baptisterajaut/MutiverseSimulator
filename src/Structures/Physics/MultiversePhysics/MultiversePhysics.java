package Structures.Physics.MultiversePhysics;

import Structures.Physics.Physics;
import Structures.Verse;

import java.util.List;

public interface MultiversePhysics extends Physics {
    List<Verse> interact(Verse universe1, Verse universe2);

}
