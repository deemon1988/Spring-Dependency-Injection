package org.example.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListPatients implements Expectable {

   private List<Patient> patientsList;

   public void init() {
      List<Patient> patientList = new ArrayList<>();
      // patientList.add(new Patient("Samantha Williams"));
      setPatientsList(patientList);

   }

   @Override
   public void add(Patient arg) {
      this.patientsList.add(arg);
//      List<Patient> newPatients = new ArrayList<>();
//      newPatients.add(arg);
//      setPatientsList(newPatients);
   }

   @Override
   public void feed() {
      for (int i = 0; i < getPatientsList().size(); i++) {
         while (!getPatientsList().isEmpty()) {
            getPatientsList().remove(i);
         }
      }
   }
}
