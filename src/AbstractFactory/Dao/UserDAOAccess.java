package AbstractFactory.Dao;

import AbstractFactory.Model.User;

/**
 * Created by shuoshu on 2017/10/27.
 */
public class UserDAOAccess implements UserDAO {
    @Override
    public void insertUser(User user) {
        System.out.println("Access, insert");
    }

    @Override
    public User getUser(int id) {
        System.out.println("Access, get");
        return null;
    }
}
