package question2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Trying instances of different classes");
		Person p1 = new Person("Janio", 39);
		Person p2 = new Employee("Janio", 39, "dev");
		
		System.out.println("Hash for Object of " + p1.getClass().getSimpleName() );
		System.out.println(p1.hashCode());
		System.out.println("Hash for Object of " + p2.getClass().getSimpleName() );
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.println("Equal? ");
		System.out.println(p1.equals(p2));
		
		
		System.out.println("-------------------------------------");
		
		System.out.println("Trying instances of the same class Employee");
		
		Person emp1 = new Employee("JAnio", 39, "eng");
		Person emp2 = new Employee("Janio", 39, "eng");
		
		System.out.println("Hash for Object of " + emp1.getClass().getSimpleName() );
		System.out.println(emp1.hashCode());
		System.out.println("Hash for Object of " + emp2.getClass().getSimpleName() );
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());

		System.out.println("Equal? ");
		System.out.println(emp1.equals(emp2));
		System.out.println("-------------------------------------");
		
		System.out.println("Trying instance of the same class Person");
		
		Person p_1 = new Person("Janio", 40);
		Person p_2 = new Person("Janio", 40);
		
		System.out.println("Hash for Object of " + p_1.getClass().getSimpleName() );
		System.out.println(p_1.hashCode());
		System.out.println("Hash for Object of " + p_2.getClass().getSimpleName() );
		System.out.println(p_2.hashCode());
		
		System.out.println(p_1.toString());
		System.out.println(p_2.toString());

		System.out.println("Equal? ");
		System.out.println(p_1.equals(p_2));
		
	}

}
