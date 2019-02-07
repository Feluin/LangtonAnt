package langton.acesssystem;

import langton.cryptstrategys.ICryptStrategy;

public class User
{

    private String name;
    private ICryptStrategy strategy;
    private UserLevel level;
    private String hash;

    public  enum UserLevel{
        ADMIN,ANALYST,VIEWER
    }
    public User(String name, ICryptStrategy strategy,String password, UserLevel level)
    {
        this.name = name;
        this.strategy = strategy;
        this.level = level;
        hash=strategy.encrypt(password);
    }

    public ICryptStrategy getStrategy()
    {
        return strategy;
    }

    public String getHash()
    {
        return hash;
    }

    public String getName()
    {
        return name;
    }

    public UserLevel getLevel()
    {
        return level;
    }


}
