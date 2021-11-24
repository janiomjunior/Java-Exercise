/*
 * Copyright (c) 2006-2019 Henri Tremblay.
 */
package question2;

public class Person {
	
    private final int age;
    
    private final String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " has " + age + " years old";
    }
    
    @Override
    public int hashCode() {
    	
    	return (int) age * name.hashCode();
    	
    }
    
    
    public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
    public boolean equals(Object x) {
    	
    	if (this == x) return true; //referencing to the own class object
    	if (x == null) return false;
    	if (this.getClass() != x.getClass()) return false;
    	
    	Person p = (Person) x;
    	
    	return this.getAge() == p.getAge() && this.getName().equals(p.getName()); 
    	
    	
    }
    
}
