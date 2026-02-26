package Session13.HW4;

public class main {
    static void main(String[] args) {
        EmergencyRoom room = new EmergencyRoom();
        room.emergencyCheckIn("A");
        room.patientCheckIn("B");
        room.treatPatient();
    }
}
