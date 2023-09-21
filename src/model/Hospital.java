package model;

import java.util.List;

public class Hospital {
      private long id;
      private String hospitalName;
      private String address;
      private List<Department>departmentsList;
      private List<Doctor> doctorList;
      private List<Patient>patientList;

      public Hospital(){

      }

      public Hospital(long id, String hospitalName, String address) {
            this.id = id;
            this.hospitalName = hospitalName;
            this.address = address;
      }

      public Hospital(long id, String hospitalName, String address, List<Department> departmentsList, List<Doctor> doctorList, List<Patient> patientList) {
            this.id = id;
            this.hospitalName = hospitalName;
            this.address = address;
            this.departmentsList = departmentsList;
            this.doctorList = doctorList;
            this.patientList = patientList;
      }

      public long getId() {
            return id;
      }

      public void setId(long id) {
            this.id = id;
      }

      public String getHospitalName() {
            return hospitalName;
      }

      public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
      }

      public String getAddress() {
            return address;
      }

      public void setAddress(String address) {
            this.address = address;
      }

      public List<Department> getDepartmentsList() {
            return departmentsList;
      }

      public void setDepartmentsList(List<Department> departmentsList) {
            this.departmentsList = departmentsList;
      }

      public List<Doctor> getDoctorList() {
            return doctorList;
      }

      public void setDoctorList(List<Doctor> doctorList) {
            this.doctorList = doctorList;
      }

      public List<Patient> getPatientList() {
            return patientList;
      }

      public void setPatientList(List<Patient> patientList) {
            this.patientList = patientList;
      }

      @Override
      public String toString() {
            return "\n" +
                    "\n~ ~ HOSPITAL ~ ~" +
                    "\n     ID : " + id +
                    "\nHOSPITAL NAME : " + hospitalName +
                    "\nADDRESS : " + address +
                    "\nDEPARTMENT : " + departmentsList +
                    "\nDOCTORS : " + doctorList +
                    "\nPATIENTS : " + patientList +
                    '\n';
      }
}
