package langton.commands;

import langton.LangtonSimulation;

public class ViewCommand implements IAntCommand{
    private LangtonSimulation langtonSimulation;

    public ViewCommand(LangtonSimulation langtonSimulation){

        this.langtonSimulation = langtonSimulation;
    }
    @Override
    public void execute() {
        langtonSimulation.printCurrentState();

    }
}
