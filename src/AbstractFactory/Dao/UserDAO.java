package AbstractFactory.Dao;

import AbstractFactory.Model.User;

/**
 * Created by shuoshu on 2017/10/27.
 */
public interface UserDAO {
    public abstract void insertUser(User user);
    public abstract User getUser(int id);
}
