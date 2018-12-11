package Physics.Basic;

import Physics.BasePhysics.BasePhysics;

public class Basic2DPhysics extends BasicMultiDPhysics {
    private static Basic2DPhysics instance;

    private Basic2DPhysics() {
    }

    public static BasePhysics getPhysics() {
        if (instance == null)
            instance = new Basic2DPhysics();
        return instance;
    }


    @Override
    public String[] listPointCharacteritics() {
        return new String[]{"x", "y", "SpeedX", "SpeedY"};
    }

}
