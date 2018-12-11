package Structures.Physics.MultiversePhysics;

import Structures.Verse;

import java.util.ArrayList;

public abstract class Multiverse implements Verse {
    protected ArrayList<Verse> verses;
    private MultiversePhysics multiversePhysics;

    public Multiverse(MultiversePhysics physics) {
        this.multiversePhysics = physics;
        verses = new ArrayList<>();
    }

    public void doOneClick() {
        //matrixexamples simulate a more complex universe than themself
        ArrayList<Verse> newVerse = new ArrayList<>(verses);
        for (Verse u1 : verses) {
            u1.doOneClick();
            for (Verse u2 : verses) {
                if (u1 == u2) continue;
                newVerse.remove(u1);
                newVerse.remove(u2);
                multiversePhysics.interact(u1, u2);

            }
        }
        verses = newVerse;

    }

}
