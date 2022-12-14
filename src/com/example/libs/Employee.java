package com.example.libs;

public class Employee {
	private String empnum;
	private int base,night,family;
	private String name, dname;
	private int ho_pay, fam_pay, night_pay, total,  salary;
	public Employee(String empnum, String name, int base, int night, int family) {
		this.empnum = empnum;
		this.name = name;
		this.base = base;
		this.night = night;
		this.family = family;
	}
	
	
	public String getEmpnum() {
		return empnum;
	}


	public void setEmpnum(String empnum) {
		this.empnum = empnum;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getNight() {
		return night;
	}


	public void setNight(int night) {
		this.night = night;
	}


	public int getFamily() {
		return family;
	}


	public void setFamily(int family) {
		this.family = family;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public int getHo_pay() {
		return ho_pay;
	}


	public void setHo_pay(int ho_pay) {
		this.ho_pay = ho_pay;
	}


	public int getFam_pay() {
		return fam_pay;
	}


	public void setFam_pay(int fam_pay) {
		this.fam_pay = fam_pay;
	}


	public int getNight_pay() {
		return night_pay;
	}


	public void setNight_pay(int night_pay) {
		this.night_pay = night_pay;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return String.format(
				"%-5s%5s%5s%7s%7d%7d%7d%10d%10d]",
				empnum, name, dname, base, ho_pay, fam_pay, night_pay, total, salary);
	}
	
}
