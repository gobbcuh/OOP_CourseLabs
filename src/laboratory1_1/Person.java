package laboratory1_1;

public class Person
{
	private String name, country;
	private int age;
	
	Person(String name, int age, String country) 
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	String setName(String name) {
		this.name = name;
		return name;
	}
	
	int setAge(int age) {
		this.age = age;
		return age;
	}
	
	String setCountry(String country) {
		this.country = country;
		return country;
	}
	
	String getName() {
		System.out.print("Name: ");
		return name;
	}
	
	int getAge() {
		System.out.print("Age: ");
		return age;
	}
	
	String getCountry() {
		System.out.print("Country: ");
		return country;
	}
}
