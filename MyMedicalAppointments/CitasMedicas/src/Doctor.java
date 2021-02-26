import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0;
    private String name;
    private String email;
    private String speciality;

    Doctor(){
        System.out.println("Construyendo el metodo Doctor");
    }

    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamiento
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

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

