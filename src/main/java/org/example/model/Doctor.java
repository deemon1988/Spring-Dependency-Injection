package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Doctor implements Clinic{

    private Long id;
    private String name;
    private String speciality;


    private List<Patient> patientList;


    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Doctor(String name, String speciality, List<Patient> patientList) {
        this.name = name;
        this.speciality = speciality;
        this.patientList = patientList;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                 ", patients=" + patientList +
                '}';
    }

    public void init(){
        List<Patient> patients = new ArrayList<>();
       // patients.add(new Patient("J. Smalling",new Doctor("Dr. Sanders", "General")));
        setPatientList(patients);
    }

    public void destroy(){
        System.out.println("Сфинкс ушел");
    }
}
