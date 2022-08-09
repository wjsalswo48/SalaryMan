
public class Employee {
	private String empnum;
	private int base,night,family;
	private String name, dname, ho_pay, fam_pay, night_pay, total,  salary;
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
	public String getHo_pay() {
		return ho_pay;
	}
	public void setHo_pay(String ho_pay) {
		this.ho_pay = ho_pay;
	}
	public String getFam_pay() {
		return fam_pay;
	}
	public void setFam_pay(String fam_pay) {
		this.fam_pay = fam_pay;
	}
	public String getNight_pay() {
		return night_pay;
	}
	public void setNight_pay(String night_pay) {
		this.night_pay = night_pay;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format(
				"Employee [%-5s%5s%5s%5s%5d%10d%7d%7d%10d%10d]",
				empnum, name, dname, base, ho_pay, fam_pay, night_pay, total, salary);
	}
	
}
