import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Juan Pablo Marin", "juanp@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        System.out.println(myDoctor);

        User user = new Doctor("Tatiana", "tats@mail.com");
        user.showDataUser();

        User userPatient = new Patient("Daniela Reyes", "dani@mail.com");
        userPatient.showDataUser();

        /*
        for (Doctor.AvailableAppointment availableAppointment:
             myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient);
        */
    }
}