package langton.commands;

import langton.LangtonSimulation;

public class CreateCommand implements IAntCommand {
        private LangtonSimulation simulation;
    private int width;
    private int height;

    public CreateCommand(LangtonSimulation simulation,int width, int height){
        this.simulation=simulation;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        simulation.create(width,height);
    }
}
