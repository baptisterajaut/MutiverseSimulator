package Physics.Basic;

import Physics.BasePhysics.BasePhysics;

public class Basic3DPhysics extends BasicMultiDPhysics {

    private static Basic3DPhysics instance;

    private Basic3DPhysics() {
    }

    public static BasePhysics getPhysics() {
        if (instance == null)
            instance = new Basic3DPhysics();
        return instance;
    }


    @Override
    public String[] listPointCharacteritics() {
        return new String[]{"x", "y", "z", "SpeedX", "SpeedY", "SpeedZ"};
    }

}
