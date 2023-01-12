public class Doctor {
    //Attributes
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Constructing Doctor Object");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: "+ name);
    }

    //Behaviour
    public void  showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
