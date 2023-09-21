import dao.daoImpl.HospitalDaoImpl;
import model.*;
import service.HospitalService;
import service.serviceImpl.HospitalServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Hospital>hospitalList=new ArrayList<>();
        List<Department>departmentList = new ArrayList<>();
        List<Doctor> doctorList=new ArrayList<>();
        List<Patient>patientList=new ArrayList<>();
        DataBase dataBase = new DataBase(hospitalList,doctorList,departmentList,patientList);


        HospitalService hospitalService = new HospitalServiceImpl(dataBase);
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    1 . add new hospital 
                    2 . to search hospital by id
                                      
                    """);
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    Scanner scanner1 = new Scanner(System.in);
                    Hospital hospital = new Hospital();
                    System.out.println("enter a name of hospital :");
                    String name = scanner1.nextLine();
                    System.out.println("enter a address of hospital : ");
                    String address = scanner1.nextLine();
                    hospital.setHospitalName(name);
                    hospital.setAddress(address);
                    System.out.println(hospitalService.addHospital(hospital));
                }
                case 2 -> {
                    System.out.println("enter a id of hospital : ");
                    long id =new Scanner(System.in).nextLong();
                    System.out.println(hospitalService.findHospitalById(id));
                }
            }
        }
    }
}