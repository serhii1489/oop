public class Doctor extends People implements Info{

    private String specialization;

    @Override
    public void ask() {
        System.out.println("Howe are you?");
    }

    public Doctor(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void diagnostic() {
        System.out.println("diagnosis case");
    }


    @Override
    public void showInfo() {
        System.out.println("Doctor name is: "+getName());
        System.out.println("Doctor surname is: "+getSurname());
        System.out.println("Specialization  is: "+getSpecialization());
    }
}
