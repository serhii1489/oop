package hw2_salary;

public class WorkerOneHour implements Salary {

    private int payDays;

    public int getPayDays() {
        return payDays;
    }

    public void setPayDays(int payDays) {
        this.payDays = payDays;
    }

    private int oneHourPay;

    public int getOneHourPay() {
        return oneHourPay;
    }

    public void setOneHourPay(int oneHourPay) {
        this.oneHourPay = oneHourPay;
    }

    public WorkerOneHour(int payDays, int oneHourPay) {
        this.payDays = payDays;
        this.oneHourPay = oneHourPay;
    }

    @Override
    public void salaryCalculate() {
    int oneYearSalary = oneHourPay*8*payDays*12;
        System.out.println("One year salary is "+oneYearSalary+"$");
    }
}
