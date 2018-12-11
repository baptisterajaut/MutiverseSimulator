package Physics.BasePhysics;

import Physics.Physics;

import java.util.List;

/**
 * Physics for elemntayParticles
 */
public interface ElemenetaryParticlePhysics extends Physics {

    /**
     * How a single elementaryParticle should behave if let alone
     *
     * @param elementaryParticle ElementaryParticle to behave
     */
    List<ElementaryParticle> aloneBehiavor(ElementaryParticle elementaryParticle);

    /**
     * How to two elementaryParticles should interact into eachOthers
     *
     * @param elementaryParticleA
     * @param elementaryParticleB
     */
    List<ElementaryParticle> interact(ElementaryParticle elementaryParticleA, ElementaryParticle elementaryParticleB);

    /**
     * List characteristics of a point for theses physics
     * @return
     */
    String[] listPointCharacteritics();

    /**
     * Utility : Two elementaryParticles are at the same spot?
     * @param a
     * @param b
     * @return true if their position is equals
     */
    boolean positionEquals(ElementaryParticle a, ElementaryParticle b);


}
