package model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
   private List<Hospital>hospitalList;
    private List<Doctor>doctorList;
    private List<Department>departmentList;
    private List<Patient> patientList;

    public DataBase(){

    }

    public DataBase(List<Hospital> hospitalList, List<Doctor> doctorList, List<Department> departmentList, List<Patient> patientList) {
        this.hospitalList = hospitalList;
        this.doctorList = doctorList;
        this.departmentList = departmentList;
        this.patientList = patientList;
    }

    public List<Hospital> getHospitalList() {
        if(hospitalList==null){
            hospitalList=new ArrayList<>();
        }
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public String toString() {
        return "DataBase" +
                "hospitalList=" + hospitalList +
                ", doctorList=" + doctorList +
                ", departmentList=" + departmentList +
                ", patientList=" + patientList ;
    }
}
