package Examples.BasicPhysicsExamples;


import Structures.Physics.UniversePhysics.ElemenetaryParticlePhysics;
import Structures.Physics.UniversePhysics.ElementaryParticle;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicNDPhysics implements ElemenetaryParticlePhysics {
    public final int STATIC_CHARACTERISTICS = listPointCharacteritics().length / 2;


    @Override
    public List<ElementaryParticle> aloneBehiavor(ElementaryParticle elementaryParticle) {
        elementaryParticle.time++;
        for (int i = 0; i < STATIC_CHARACTERISTICS; i++) {
            elementaryParticle.characteritics.replace(
                    listPointCharacteritics()[i],
                    Integer.toString(
                            Integer.parseInt(elementaryParticle.characteritics.get(listPointCharacteritics()[i]))
                                    +
                                    Integer.parseInt(
                                            elementaryParticle.characteritics.get(
                                                    listPointCharacteritics()[i + STATIC_CHARACTERISTICS]))
                    )
            );

        }
        ArrayList<ElementaryParticle> list = new ArrayList<>();
        list.add(elementaryParticle);
        return list;
    }

    @Override
    public List<ElementaryParticle> interact(ElementaryParticle elementaryParticleA, ElementaryParticle elementaryParticleB) {
        /*
        elementaryParticleA = (ElementaryParticle) elementaryParticleA.clone();
        elementaryParticleB = (ElementaryParticle) elementaryParticleB.clone();*/

        ArrayList<ElementaryParticle> list = new ArrayList<>();
        list.add(elementaryParticleA);
        if (!positionEquals(elementaryParticleA, elementaryParticleB)) {
            list.add(elementaryParticleB);
        }
        return list;
    }

    @Override
    public boolean positionEquals(ElementaryParticle a, ElementaryParticle b) {
        for (int i = 0; i < STATIC_CHARACTERISTICS; i++) {
            if (!a.characteritics.get(listPointCharacteritics()[i]).equals(b.characteritics.get(listPointCharacteritics()[i])))
                return false;
        }
        return true;
    }
}
