import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Juan Pablo Marin", "Neurologo");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        for (Doctor.AvailableAppointment availableAppointment:
             myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("31592632");
        System.out.println(patient.getPhoneNumber());
    }
}