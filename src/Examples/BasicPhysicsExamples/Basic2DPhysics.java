package Examples.BasicPhysicsExamples;


import Structures.Physics.UniversePhysics.ElemenetaryParticlePhysics;

public class Basic2DPhysics extends BasicNDPhysics {
    private static Basic2DPhysics instance;

    private Basic2DPhysics() {
    }

    public static ElemenetaryParticlePhysics getPhysics() {
        if (instance == null)
            instance = new Basic2DPhysics();
        return instance;
    }


    @Override
    public String[] listPointCharacteritics() {
        return new String[]{"x", "y", "SpeedX", "SpeedY"};
    }

}
