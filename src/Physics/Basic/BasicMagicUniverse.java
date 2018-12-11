package Physics.Basic;

import Physics.BasePhysics.BasePhysics;
import Physics.BasePhysics.Point;
import Physics.BasePhysics.Universe;

import java.util.ArrayList;

public class BasicMagicUniverse extends Universe {

    private int magicAmount;

    public int getMagicAmount() {
        return magicAmount;
    }

    public void setMagicAmount(int magicAmount) {
        this.magicAmount = magicAmount;
    }

    public BasicMagicUniverse(BasePhysics physics, int size) {
        super(physics);
        magicAmount = 100;

        points = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Point newp = new Point();
            for (int k = 0; k < physics.listPointCharacteritics().length; k++) {
                newp.characteritics.put(physics.listPointCharacteritics()[k], "0");
            }
            points.add(newp);
        }
    }


}
