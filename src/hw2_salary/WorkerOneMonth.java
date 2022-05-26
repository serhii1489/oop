package hw2_salary;

public class WorkerOneMonth implements Salary{
    private int oneMonthPay;

    public int getOneMonthPay() {
        return oneMonthPay;
    }

    public void setOneMonthPay(int oneMonthPay) {
        this.oneMonthPay = oneMonthPay;
    }

    public WorkerOneMonth(int oneMonthPay) {
        this.oneMonthPay = oneMonthPay;
    }

    @Override
    public void salaryCalculate() {
        int oneYearSalary = oneMonthPay*12;
        System.out.println("One year salary is "+oneYearSalary+"$");
    }
}
