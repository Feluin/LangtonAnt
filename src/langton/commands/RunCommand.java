package langton.commands;

import langton.LangtonSimulation;

public class RunCommand implements IAntCommand {
    private LangtonSimulation langtonSimulation;

    public RunCommand(LangtonSimulation langtonSimulation){

        this.langtonSimulation = langtonSimulation;
    }
    @Override
    public void execute() {
        langtonSimulation.nextMove();
    }
}
