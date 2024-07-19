package dal;

/**
 * Singleton, so that only one instance/object can be created
 */
public class UserDatabase {
    private static UserDatabase instance;

    private UserDatabase(){
        //Makes the constructor private, no one will be alllowed to call the constructor

    }
    public static synchronized UserDatabase getInstance(){
        if(instance==null)
            instance = new UserDatabase();// will only be created the first time
        return instance;
    }
}
