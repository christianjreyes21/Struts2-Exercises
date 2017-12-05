package ust.payroll.action;

import ust.payroll.utility.ComputePayrollService;

public class PayrollComputeAction {
	private double hoursWorked;
	private double payRate;
	private double grossPay;
	
	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public double getPayRate() {
		return payRate;
	}


	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}


	public double getGrossPay() {
		return grossPay;
	}


	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}


	public String execute()
	{
		/*setHoursWorked(75);
		setPayRate(600);
		*/setGrossPay(new ComputePayrollService().computeGrossPay(getHoursWorked(), getPayRate()));
		
		System.out.println("hours Worked: " + getHoursWorked());
		System.out.println("payrate: PHP" + getPayRate());
		System.out.println("Gross Payment: PHP" + getGrossPay());
		return "success";
	}
}
