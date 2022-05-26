package hw2_salary;

public class Main {
    public static void main(String[] args) {
        WorkerOneHour workerOneHour = new WorkerOneHour(22, 16);
        workerOneHour.salaryCalculate();
        WorkerOneMonth workerOneMonth = new WorkerOneMonth(3200);
        workerOneMonth.salaryCalculate();
    }
}
