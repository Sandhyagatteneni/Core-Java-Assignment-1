package com.assignmentone;

public class Employee {
	String empName, empdesgn, empLocation;
	int empId, empAge, empExpInYrs;
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpdesgn(String empdesgn) {
		this.empdesgn = empdesgn;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public void setEmpExpInYrs(int empExpInYrs) {
		this.empExpInYrs = empExpInYrs;
	}
	public String getEmpName() {
		return empName;
	}

	public String getEmpdesgn() {
		return empdesgn;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public int getEmpExpInYrs() {
		return empExpInYrs;
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public Employee(String empName, int empId, int empAge) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
	}

	public Employee(String empName, int empId, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
	}

	public Employee(String empName, int empId, int empAge, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
	}

	public Employee(String empName, String empLocation, int empAge, int empId) {
		super();
		this.empName = empName;
		this.empLocation = empLocation;
		this.empId = empId;
		this.empAge = empAge;
	}

	public Employee(String empName, int empId, int empAge, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, String empdesgn, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empdesgn = empdesgn;
		this.empId = empId;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empId = empId;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, int empAge, String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}
	
}
