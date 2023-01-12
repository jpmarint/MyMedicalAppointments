import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Attributes
    static int id = 0; //Autoincrement
    String name;
    String speciality;
    String email;

    //Constructor
    Doctor(){
        System.out.println("Constructing Doctor Object");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: "+ name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Behaviour
    public void  showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
