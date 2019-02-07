package langton;

import langton.acesssystem.ProxyAccess;
import langton.acesssystem.User;
import langton.commands.CreateCommand;

public class Application
{
    public static void main(String[] args)
    {
        LangtonSimulation simulation=new LangtonSimulation();
        User admin= Configuration.getInstance().getUser("admin");
        ProxyAccess access=new ProxyAccess(admin, "password");
        access.grantAccess();
        access.executeCommand(new CreateCommand(simulation,1000,1000));

    }
}
