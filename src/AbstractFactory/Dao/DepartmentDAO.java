package AbstractFactory.Dao;

import AbstractFactory.Model.Department;

/**
 * Created by shuoshu on 2017/10/28.
 */
public interface DepartmentDAO {
    public abstract void insert(Department department);
    public abstract void delete(int id);
}
