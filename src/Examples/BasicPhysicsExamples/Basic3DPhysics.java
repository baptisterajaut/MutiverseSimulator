package Examples.BasicPhysicsExamples;


import Structures.Physics.UniversePhysics.ElemenetaryParticlePhysics;

public class Basic3DPhysics extends BasicNDPhysics {

    private static Basic3DPhysics instance;

    private Basic3DPhysics() {
    }

    public static ElemenetaryParticlePhysics getPhysics() {
        if (instance == null)
            instance = new Basic3DPhysics();
        return instance;
    }


    @Override
    public String[] listPointCharacteritics() {
        return new String[]{"x", "y", "z", "SpeedX", "SpeedY", "SpeedZ"};
    }

}
