import com.sun.javadoc.Doc;

import java.util.Date;

import static ui.UIMenu.*;

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
        System.out.println(myDoctor.name + ": "+ myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("31592632");
        System.out.println(patient.getPhoneNumber());
    }
}