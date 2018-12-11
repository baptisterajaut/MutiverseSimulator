import Physics.MultiverseExample;
import Physics.MultiversePhysics.MagicUniversesInteract;

public class Main {
    public static void main(String[] args){
        MultiverseExample simulation=new MultiverseExample(MagicUniversesInteract.getPhysics());
        simulation.runThemAll();
    }
}
