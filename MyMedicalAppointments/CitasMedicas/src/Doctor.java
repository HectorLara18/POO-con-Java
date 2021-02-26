import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;

    Doctor(String name, String email, String speciality){
        super(name, email);
        this.speciality = speciality;

    }

    //Comportamiento
    //Metodo creado a nivel de clase Doctor que recibe como parametro
    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvaialbleAppointment(Date date, String time){
        availableAppointment.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }

    public class AvailableAppointment {

        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
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

