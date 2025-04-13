package laboratory3_4;

public class Programmer extends Employee {
    @Override
    void calculateSalary() {
        grossPay = 1900000;
        deductions = 0.2f * grossPay;
        netPay = grossPay - deductions;
        System.out.println("Programmer's Salary: " + netPay);
    }
}
