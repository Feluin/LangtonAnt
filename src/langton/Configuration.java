package langton;

import langton.acesssystem.User;
import langton.cryptstrategys.MD5Strategy;
import langton.cryptstrategys.SHA1Strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Configuration {
    private static Configuration instance=new Configuration();
    private Map<String,User> users=new HashMap<>();
    public  static Configuration getInstance()
    {
        return instance;
    }

    private Configuration(){
        users.put("admin",new User("admin",new MD5Strategy(),"password", User.UserLevel.ADMIN));
        users.put("adm",new User("admin",new SHA1Strategy(),"password2", User.UserLevel.ADMIN));
        //TODO:hier neue User anlegen
    }

    public User getUser(String username){
        return users.get(username);
    }
}
