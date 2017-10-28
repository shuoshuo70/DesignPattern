package AbstractFactory;


/**
 * Created by shuoshu on 2017/10/28.
 */
public class FactoryConsole {
    /**
     * 抽象工厂模式采用反射+配置文件的方式，下面的两个字符串projectName和dbName要写在配置文件中，
     * UserDAO的生成是依靠反射得到，这样就不需要Factory类了。这有就是Spring的做法，只需要Model和
     * Dao两个包就好

    public static final String projectName = "抽象工厂模式";
    public static final String dbName = "Access";

     public static void main(String[] args) {
        UserDAO userDAO = (UserDAO)Assembly.load(projectName).createInstance("UserSAO" + dbName);
     }
     */
}
