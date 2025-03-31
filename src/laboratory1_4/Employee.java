package laboratory1_4;

public class Employee 
{
	private int employee_id;
	private String employee_name;
	private double employee_salary;
	
	public Employee(String employee_name, int employee_id, double employee_salary)
	{
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.employee_salary = employee_salary;
	}
	
	String setEmployeeName(String employee_name) {
		this.employee_name = employee_name;
		return employee_name;
	}
	
	int setEmployeeID(int employee_id) {
		this.employee_id = employee_id;
		return employee_id;
	}
	
	String getEmployeeName() {
		System.out.print("Employee Name: ");
		return employee_name;
	}
	
	int getEmployeeID() {
		System.out.print("Employee ID: ");
		return employee_id;
	}
	
	double getEmployeeSalary() {
		System.out.print("Employee Salary: ");
		return employee_salary;
	}
}
