package com.fun;

public class ClassB {
	private String firstName;

	private ClassA A;

	ClassB(ClassA A) {
		this.A = A;
	}

	public String getFirstName() {
		return firstName + A.getName();
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public ClassA getA() {
		return A;
	}

	public void setA(ClassA a) {
		A = a;
	}

}
