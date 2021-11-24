/*
 * Copyright (c) 2006-2019 Henri Tremblay.
 */
package question2;

public class Employee extends Person {
	
    private final String role;

    public Employee(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
    
    

    @Override
    public String toString() {
        return getClass().getSimpleName() 
        		+ " " + getName() 
        		+ " has " + getAge() + " years old" 
        		+ " he is " + getRole() ;
    }

    
	public String getRole() {
		return role;
	}
	
	
	@Override
    public int hashCode() {
    	
    	return (int) getAge() * getName().hashCode() * role.hashCode();
    	
    }
    
    @Override
    public boolean equals(Object x) {
    	
    	if (this == x) return true; //referencing to the own class object
    	if (x == null) return false;
    	if (this.getClass() != x.getClass()) return false;
    	
    	Employee emp = (Employee) x;
    	
    	
    	return this.getRole() == emp.getRole() && emp.getName() == super.getName() && emp.getAge() == super.getAge(); 
    	
    	
    }
    
}
