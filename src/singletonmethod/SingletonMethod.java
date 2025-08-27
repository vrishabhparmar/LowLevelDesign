package singletonmethod;

public class SingletonMethod {

    public static volatile SingletonMethod instance = null;
    private String data;
    /*
    * Private constructor so no outside class can create new Singleton instance*/
    private SingletonMethod(String data)
    {
        this.data = data;
    }

    public static SingletonMethod getInstance(String data)
    {
        if(instance == null)
        {
            synchronized (SingletonMethod.class)
            {
                if(instance == null)
                {
                    return new SingletonMethod(data);
                }
            }
        }
        return instance;
    }


}
