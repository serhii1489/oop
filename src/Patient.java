public class Patient extends People implements Info{

   private String clinical_diagnosis;

    public String getClinical_diagnosis() {
        return clinical_diagnosis;
    }

    public void setClinical_diagnosis(String clinical_diagnosis) {
        this.clinical_diagnosis = clinical_diagnosis;
    }

    public Patient(String name, String surname, int age) {
        super(name, surname, age);
    }


    public void give_a_symptoms() {
        System.out.println("symptom is");
    }

    @Override
    public void showInfo() {
        System.out.println("patient name is: "+getName());
        System.out.println("patient surname is: "+getSurname());
        System.out.println("patient diagnosis: "+clinical_diagnosis);
    }
}
