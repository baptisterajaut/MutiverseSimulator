package Examples.BasicExamples;

import Physics.BasePhysics.ElemenetaryParticlePhysics;
import Physics.BasePhysics.ElementaryParticle;
import Physics.BasePhysics.Universe;

import java.util.ArrayList;

public class BasicMagicUniverse extends Universe {

    private int magicAmount;

    public BasicMagicUniverse(ElemenetaryParticlePhysics physics, int size) {
        super(physics);
        magicAmount = 100;

        elementaryParticles = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ElementaryParticle newp = new ElementaryParticle();
            for (int k = 0; k < physics.listPointCharacteritics().length; k++) {
                newp.characteritics.put(physics.listPointCharacteritics()[k], "0");
            }
            elementaryParticles.add(newp);
        }
    }

    public int getMagicAmount() {
        return magicAmount;
    }

    public void setMagicAmount(int magicAmount) {
        this.magicAmount = magicAmount;
    }


}
