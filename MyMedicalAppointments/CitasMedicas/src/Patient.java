public class Patient extends User {
    //Atriutos

    private String birthday;
    private double weight;
    private double height;
    String blood;

    Patient(String name, String email) {
        super(name, email);
    }

}