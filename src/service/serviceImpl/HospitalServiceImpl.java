package service.serviceImpl;

import dao.HosptalDao;
import dao.daoImpl.HospitalDaoImpl;
import model.DataBase;
import model.Hospital;
import model.Patient;
import service.HospitalService;

import java.util.List;
import java.util.Map;

public class HospitalServiceImpl implements HospitalService {
    HospitalDaoImpl hospitalDao = new HospitalDaoImpl();

    private DataBase dataBase;

    public HospitalServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }


//   HospitalDaoImpl hospitalDao = new HospitalDaoImpl();
// hospitalDao.addHospital(hospital);
    @Override
    public String addHospital(Hospital hospital) {
        return   hospitalDao.addHospital(hospital);

    }

    @Override
    public Hospital findHospitalById(Long id) {
        return null;
    }

    @Override
    public List<Hospital> getAllHospital() {
        return null;
    }

    @Override
    public List<Patient> getAllPatientFromHospital(Long id) {
        return null;
    }

    @Override
    public String deleteHospitalById(Long id) {
        return null;
    }

    @Override
    public Map<String, Hospital> getAllHospitalByAddress(String address) {
        return null;
    }
}
