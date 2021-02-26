public class Patient {
    //Atriutos
    static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    String blood;

    Patient(String name, String email) {
        id++;
        this.name = name;
        this.email = email;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {

        if(phoneNumber.length() != 10){
            System.out.println("Ingresa un numero de telefono con 8 digitos");
        } else {
        this.phoneNumber = phoneNumber;
     }
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}