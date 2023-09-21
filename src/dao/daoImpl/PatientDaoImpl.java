package dao.daoImpl;

import dao.GenericDao;
import dao.PatientDao;
import model.Patient;

import java.util.List;
import java.util.Map;

public class PatientDaoImpl implements PatientDao, GenericDao<Patient> {

    @Override
    public String add(Long hospitalId, Patient patient) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public String updateById(Long id, Patient patient) {
        return null;
    }

    @Override
    public String addPatientsToHospital(Long id, List<Patient> patients) {
        return null;
    }

    @Override
    public Patient getPatientById(Long id) {
        return null;
    }

    @Override
    public Map<Integer, Patient> getPatientByAge() {
        return null;
    }

    @Override
    public List<Patient> sortPatientsByAge(String ascOrDesc) {
        return null;
    }
}
