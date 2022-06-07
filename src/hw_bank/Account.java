package hw_bank;

public class Account {
    private String AccountOwner;
    private int expense;

    public String getAccountOwner() {
        return AccountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        AccountOwner = accountOwner;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }
}
