import Examples.MagicMultiversePhysicsExample;
import Examples.MultiverseExample;

public class Main {
    public static void main(String[] args) {
        MultiverseExample simulation = new MultiverseExample(MagicMultiversePhysicsExample.getPhysics());
        for (int i = 0; i < 5; i++)
            simulation.doOneClick();
    }
}
