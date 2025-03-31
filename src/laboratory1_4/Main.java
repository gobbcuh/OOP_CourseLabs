package laboratory1_4;

public class Main {
	public static void main(String[] args) 
	{
		Employee person = new Employee(null, 0, 999999);
		
		person.setEmployeeName("Jasmin Lorino");
		person.setEmployeeID(994173);
		
		System.out.println(person.getEmployeeName());
		System.out.println(person.getEmployeeID());
		System.out.println(person.getEmployeeSalary());
	}
}
