package Structures.Physics.UniversePhysics;

import Structures.Verse;

import java.util.ArrayList;

/**
 * Collection of particles that interact to each others
 */
public abstract class Universe implements Verse {
    /**
     * Elementary particles of the universe
     */
    protected ArrayList<ElementaryParticle> elementaryParticles;
    /**
     * Structures engine of that universe
     */
    private ElemenetaryParticlePhysics physics;

    protected Universe(ElemenetaryParticlePhysics physics) {
        this.physics = physics;
    }

    public void doOneClick() {
        ArrayList<ElementaryParticle> newElementaryParticles = new ArrayList<>(elementaryParticles);
        for (ElementaryParticle p1 : elementaryParticles) {
            physics.aloneBehiavor(p1);
            for (ElementaryParticle p2 : elementaryParticles) {

                if (p1 == p2) continue;
                newElementaryParticles.remove(p1);
                newElementaryParticles.remove(p2);
                newElementaryParticles.addAll(physics.interact(p1, p2));
            }
        }
        elementaryParticles = newElementaryParticles;
    }

    public ArrayList<ElementaryParticle> getElementaryParticles() {
        return elementaryParticles;
    }
}
