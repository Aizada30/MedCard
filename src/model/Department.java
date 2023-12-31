package model;

import java.util.List;

public class Department {
    private long id;
    private String departmentName;
    private List<Doctor> doctorList;

    public Department(long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Department(long id, String departmentName, List<Doctor> doctorList) {
        this.id = id;
        this.departmentName = departmentName;
        this.doctorList = doctorList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    @Override
    public String toString() {
        return "\n~ ~ DEPARTMENT ~ ~" +
                "\n     ID : " + id +
                "\nNAME OF DEPARTMENT :" + departmentName +
                "\nDOCTORS : " + doctorList +
                '\n';
    }
}
