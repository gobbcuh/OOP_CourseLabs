package laboratory1_1;

public class Main {

	public static void main(String[] args) 
	{
		Person p = new Person(null, 0, null);
		
		p.setName("Jasmin");
		p.setAge(18);
		p.setCountry("Philippines");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getCountry());
	}

}
