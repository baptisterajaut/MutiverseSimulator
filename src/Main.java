import Simulation.MagicMultiverseExample;
import Physics.MultiversePhysics.MagicUniversesInteract;

public class Main {
    public static void main(String[] args){
        MagicMultiverseExample simulation=new MagicMultiverseExample(MagicUniversesInteract.getPhysics());
        simulation.runThemAll();
    }
}
