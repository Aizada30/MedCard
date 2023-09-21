package service.serviceImpl;

import model.Department;
import service.DepartmentService;
import service.GenericService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService, GenericService<Department> {



    @Override
    public List<Department> getAllDepartmentByHospital(Long id) {
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
