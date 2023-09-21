package dao.daoImpl;

import dao.DepartmentDao;
import dao.GenericDao;
import model.DataBase;
import model.Department;
import model.Hospital;

import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao, GenericDao<Department> {
    private DataBase dataBase;


    @Override
    public List<Department> getAllDepartmentByHospital(Long id) {
        List<Hospital> hospitals = dataBase.getHospitalList().stream().filter(hospital -> hospital.getId() == id).toList();
        return null;

    }

    @Override
    public Department findDepartmentByName(String name) {
        return null;
    }

    @Override
    public String add(Long hospitalId, Department department) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public String updateById(Long id, Department department) {
        return null;
    }
}
