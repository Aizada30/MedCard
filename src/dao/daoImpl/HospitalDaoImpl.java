package dao.daoImpl;

import dao.HosptalDao;
import model.DataBase;
import model.Hospital;
import model.Patient;

import java.util.List;
import java.util.Map;

public class HospitalDaoImpl implements HosptalDao {

   private  DataBase dataBase ;

   private static long id;
   public HospitalDaoImpl(){

   }

    public HospitalDaoImpl(DataBase dataBase){
        this.dataBase = dataBase;
    }

    @Override
    public String addHospital(Hospital hospital) {
        hospital.setId(++id);
        dataBase.getHospitalList().add(hospital);
        return "Hospital successfully saved";
    }

    @Override
    public Hospital findHospitalById(Long id) {
        dataBase.getHospitalList().stream().filter(hospital -> hospital.getId()==id).toList().forEach(System.out::println);
        return null;
    }

    @Override
    public List<Hospital> getAllHospital() {
        return dataBase.getHospitalList();
    }

    @Override
    public List<Patient> getAllPatientFromHospital(Long id) {
        dataBase.getHospitalList()
                .stream()
                .filter(hospital -> hospital.getId()==id)
                .toList()
                .get(0)
                .getPatientList()
                .forEach(System.out::println);
        return dataBase.getPatientList();
    }

    @Override
    public String deleteHospitalById(Long id) {
        dataBase.getHospitalList().stream().filter(hospital -> hospital.getId()==id).toList().remove(0);
        return null;
    }

    @Override
    public Map<String, Hospital> getAllHospitalByAddress(String address) {
        return null;
    }
}
