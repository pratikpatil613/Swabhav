package com.techlabs.employeedataheirarchy;

public class Employee {
	private int empNo;
	private String empName;
	private String job;
	private String managerId;
	private String hireDate;
	private double salary;
	private String commission;
	private int deptNo;

	public Employee(int empNo, String empName, String job, String managerId2, String hireDate, double salary,
			String commission, int deptNo) {
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.managerId = managerId2;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManage(String manage) {
		this.managerId = manage;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public double getSal() {
		return salary;
	}

	public void setSal(int sal) {
		this.salary = sal;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", managerId=" + managerId
				+ ", hireDate=" + hireDate + ", salary=" + salary + ", commission=" + commission + ", deptNo=" + deptNo
				+ "]";
	}

}
