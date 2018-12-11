import Examples.MagicUniversesInteract;
import Simulation.MagicMultiverseExample;

public class Main {
    public static void main(String[] args) {
        MagicMultiverseExample simulation = new MagicMultiverseExample(MagicUniversesInteract.getPhysics());
        simulation.runThemAll();
    }
}
