package Structures.Physics.UniversePhysics;

import java.util.HashMap;

/**
 * Most basic particle. A point
 */
public class ElementaryParticle {
    /**
     * Age of the partcle
     */
    public int time;
    /**
     * Characteristics of the particle. Position, temp...
     */
    public HashMap<String, String> characteritics;

    /**
     * Default constrictor
     */
    public ElementaryParticle() {
        characteritics = new HashMap<>();
        time = 0;
    }

    public Object clone() {
        Object p = new ElementaryParticle();
        ((ElementaryParticle) p).time = time;
        ((ElementaryParticle) p).characteritics = new HashMap<>(characteritics);

        return p;
    }


}
