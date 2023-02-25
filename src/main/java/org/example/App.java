package org.example;

import org.example.config.SpringConfig;
import org.example.model.Patient;
import org.example.model.Registry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /*Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor);

        Patient patient = context.getBean(Patient.class);
        System.out.println(patient);

        Patient patient1 = context.getBean(Patient.class);
        Doctor doctor1 = context.getBean(Doctor.class);

        System.out.println(doctor.getName());
        System.out.println(doctor1.getName());
        doctor1.setName("Dr. Who");
        System.out.println(doctor1.getName());
        System.out.println(doctor.getName());
        System.out.println(doctor==doctor1);

        System.out.println(patient.getName());
        System.out.println(patient1.getName());
        patient1.setName("Samantha Williams");
        System.out.println(patient1.getName());
        System.out.println(patient.getName());
        System.out.println(patient==patient1);*/

        Registry registry = context.getBean(Registry.class);  // можно ли связать со свойством доктора patientList ?
        System.out.println(registry.getPatient());
        System.out.println(registry.getDoctor());

        Patient patient = context.getBean(Patient.class);
        registry.setDoctor(patient);                          //  patientList.setPatient(patient) ?
        System.out.println(registry.getPatient());
        System.out.println(registry.getDoctor());

    }
}
