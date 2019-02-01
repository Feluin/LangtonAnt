package langton.commands;

import langton.Ant;
import langton.LangtonSimulation;

public class PlaceAntCommand implements IAntCommand
{

    private LangtonSimulation simulation;
    private int x;
    private int y;

    public PlaceAntCommand(LangtonSimulation simulation,
        int x,
        int y)
    {

        this.simulation = simulation;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute()
    {

        simulation.addAnt(x,y);
    }
}
