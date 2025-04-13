package laboratory3_4;

public class Manager extends Employee {
    @Override
    void calculateSalary() {
        grossPay = 50000;
        deductions = 0.2f * grossPay;
        netPay = grossPay - deductions;
        System.out.println("Manager's Salary: " + netPay);
    }
}
