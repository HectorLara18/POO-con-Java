import javax.print.Doc;

import java.util.Date;

import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Hector", "hectorlaras.18@gmail.com", "Neurologia");
        myDoctor.addAvaialbleAppointment(new Date(),"4pm");
        myDoctor.addAvaialbleAppointment(new Date(),"5pm");
        myDoctor.addAvaialbleAppointment(new Date(),"7pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointment()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient pacienteNuevo = new Patient("Jazmin", "jazito@mail.com");
        pacienteNuevo.setPhoneNumber("8182875719");
        System.out.println(pacienteNuevo.getPhoneNumber());

    }

}