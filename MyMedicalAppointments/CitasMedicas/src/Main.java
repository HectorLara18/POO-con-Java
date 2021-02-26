import javax.print.Doc;

import java.util.Date;

import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Hector", "Neurologia");
        myDoctor.addAvaialbleAppointment(new Date(),"4pm");
        myDoctor.addAvaialbleAppointment(new Date(),"5pm");
        myDoctor.addAvaialbleAppointment(new Date(),"7pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointment()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        /**

        Patient alejandra = new Patient("Alejandra", "ale.16@gmail.com");
        alejandra.setHeight(1.57);
        alejandra.setWeight(60.1);
        alejandra.setPhoneNumber("8182875719");
        System.out.println(alejandra.id);
        System.out.println(alejandra.getHeight());
        System.out.println(alejandra.getWeight());
        System.out.println(alejandra.getPhoneNumber());
        */

    }

}