package langton.acesssystem;

import langton.LangtonSimulation;
import langton.commands.CreateCommand;
import langton.commands.IAntCommand;
import langton.commands.ViewCommand;

public class RealAccess implements IAccess
{

    private User user;
    private User.UserLevel level;

    public RealAccess(User user)
    {
        this.user = user;
        level=user.getLevel();
    }

    @Override
    public void grantAccess()
    {
        System.out.print("Access granted for user:"+ user.getName());
    }

    @Override
    public void executeCommand(final IAntCommand command)
    {
        switch (level){
            case ADMIN:
                command.execute();
                break;
            case ANALYST:
                if(!(command instanceof CreateCommand)){
                    command.execute();
                }else {
                    System.out.print("You arent allowed to Create a new Simulation");
                }
                break;
            case VIEWER:
                if((command instanceof ViewCommand)){
                    command.execute();
                }else {
                    System.out.print("A Viewer can only print the Simulation");
                }
                break;
        }

    }
}
