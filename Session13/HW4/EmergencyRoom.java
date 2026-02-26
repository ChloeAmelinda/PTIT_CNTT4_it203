package Session13.HW4;

import java.util.LinkedList;

public class EmergencyRoom {
    LinkedList<String> patient= new LinkedList<>();
    void patientCheckIn(String name){
        patient.addLast(name);
        System.out.println("dang chua "+name);
    }
    void emergencyCheckIn(String name){
        patient.addFirst(name);
        System.out.println("dang cap cuu "+name);
    }
    void treatPatient(){
        if(patient.isEmpty()){
            System.out.println("Empty");
        }else {
            patient.removeFirst();
            System.out.println("name patient:" + patient);

        }
    }
}
