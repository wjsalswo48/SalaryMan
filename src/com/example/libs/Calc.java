package com.example.libs;

public class Calc {
	private Employee [] array;
	private int count;
	public Calc(Employee[] array, int count) {
		this.array = array;
		this.count = count;
	}
	public void calc() {
		for(int i = 0; i<count; i++) {
			Employee emp = this.array[i];
			String empno = emp.getEmpnum();
			String dname = this.getDname(empno.charAt(0));
			emp.setDname(dname);
			char code = empno.charAt(1);
			String codeStr = String.valueOf(code);
			int codeInt = Integer.parseInt(codeStr);
			int hopay = this.getHopay(codeInt);
			emp.setHo_pay(hopay);
			int nightpay = this.getNightpay(emp.getNight());
			emp.setNight(nightpay);
			int base = emp.getBase();
			int basePay = this.getBase(base);
			emp.setBase(basePay);
			int family = emp.getFamily();
			int famPay = 7000*family;
			emp.setFam_pay(famPay);
			
			int total = hopay + basePay + nightpay + famPay;
			emp.setTotal(total);
			
			int tax = (int)(hopay*0.1);
			int salary = total - tax;
			emp.setSalary(salary);
		}
	}

	private int getHopay(int code) {
		int [] hopays = {900000,400000,600000,800000,300000,800000};
		return hopays[code-1];
	}
	
	private int getBase(int code) {
		int [] bases = {15000, 25000, 35000, 45000};
		return bases[code-1];
	}
	
	private String getDname(char code) {
		String [] dnames = {"영업부","업무부","홍보부","인사부","경리부","판촉부","총무부"};
		return dnames[code-65];
	}
	
	private int getNightpay(int night) {
		return (night==1)?1500:
			(night==2)?2500:
				(night==3)?3500:4500;
	}
}
