import com.sun.javadoc.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Juan Pablo Marin", "Neurologo");
        System.out.println(myDoctor.name + ": "+ myDoctor.speciality);
    }
}