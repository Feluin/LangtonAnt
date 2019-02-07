package langton.acesssystem;

import langton.Configuration;
import langton.LangtonSimulation;
import langton.commands.IAntCommand;

public class ProxyAccess implements IAccess
{
    private User user;
    private String password;
    private RealAccess access;



    public ProxyAccess(final User user,
        final String password)
    {
        this.user = user;
        this.password = password;
    }

    @Override
    public void grantAccess()
    {
        if (user.getStrategy().encrypt(password).equals(user.getHash()))
        {
            access = new RealAccess(user);
        }else {
            System.out.println("Your password doesnt match");
        }

    }

    @Override
    public void executeCommand(final IAntCommand command)
    {
        if (access != null)
        {
            access.executeCommand(command);
        } else
        {
            System.out.println("You have no access to execute this command!");
        }
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(final User user)
    {
        this.user = user;
    }
}
