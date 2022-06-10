package hw_bank;

public class Main {
    public static void main(String[] args) {
    Application application = new Application();
    application.setCreditAccount( 1, new User("Max"));
    CreditAccount ca = new CreditAccount(1);
    ca.setUser(new User("Max"));

    }
}
