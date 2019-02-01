package langton.acesssystem;

public class ProxyAccess implements IAccess
{
    private User user;
    RealAccess realAccess = new RealAccess();

    public ProxyAccess(User user)
    {
        this.user = user;
    }

    @Override
    public void grantaccess()
    {

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
