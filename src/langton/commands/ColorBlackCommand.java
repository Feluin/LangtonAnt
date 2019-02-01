package langton.commands;

import langton.LangtonSimulation;

public class ColorBlackCommand implements IAntCommand
{
    private LangtonSimulation simulation;
    private int x;
    private int y;

    public ColorBlackCommand(LangtonSimulation simulation,
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
        simulation.setFieldBlack(x,y);
    }
}
