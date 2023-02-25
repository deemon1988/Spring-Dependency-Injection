package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Getter
@Setter
@Component
@Scope("prototype")
@Primary
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class Patient implements Clinic{

    private Long id;
    @Value("${patient.name}")
    private String name ;

    private Doctor doctor;

    public Patient(String name, Doctor doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doctor=" + doctor +
                '}';
    }


}
