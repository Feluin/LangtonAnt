package langton.acesssystem;

import langton.commands.IAntCommand;

public interface IAccess {

    void grantAccess();
    void executeCommand(IAntCommand command);
}
