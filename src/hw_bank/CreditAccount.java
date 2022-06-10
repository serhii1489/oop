package hw_bank;

public class CreditAccount extends Account{
    private int id;

    public CreditAccount(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
