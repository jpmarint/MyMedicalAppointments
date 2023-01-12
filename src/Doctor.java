public class Doctor {
    //Attributes
    static int id;
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Constructing Doctor Object");
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: "+ name);
    }

    //Behaviour
    public void  showName(){
        System.out.println(name);
    }
}
