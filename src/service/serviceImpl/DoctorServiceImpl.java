package service.serviceImpl;

import model.Doctor;
import service.DoctorService;
import service.GenericService;

import javax.print.Doc;
import java.util.List;

public class DoctorServiceImpl implements DoctorService, GenericService<Doctor> {

    @Override
    public Doctor findDoctorById(Long id) {
        return null;
    }

    @Override
    public String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorsByHospitalId(Long id) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorsByDepartmentId(Long id) {
        return null;
    }

    @Override
    public String add(Long hospitalId, Doctor doctor) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public String updateById(Long id, Doctor doctor) {
        return null;
    }
}
