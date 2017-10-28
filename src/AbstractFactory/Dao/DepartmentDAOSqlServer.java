package AbstractFactory.Dao;

import AbstractFactory.Model.Department;

/**
 * Created by shuoshu on 2017/10/28.
 */
public class DepartmentDAOSqlServer implements DepartmentDAO {
    @Override
    public void insert(Department department) {
        System.out.println("SqlServer, insert");
    }

    @Override
    public void delete(int id) {
        System.out.println("SqlServer, delete");
    }
}
