public class Main {
    public static void main(String[] args) {
    Doctor doctor = new Doctor("Max", "Bird", 50);
    doctor.setSpecialization("surgeon");
    doctor.diagnostic();
    doctor.speak();
    doctor.showInfo();
    doctor.ask();
        System.out.println("------------------------------------");
    Patient patient = new Patient("Sten", "Smith", 38);
    patient.setClinical_diagnosis("appendix");
    patient.showInfo();

    }
}
