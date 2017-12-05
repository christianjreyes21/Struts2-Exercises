package ust.payroll.action;

import ust.payroll.utility.ComputePayrollService;

public class PayrollComputeAction 
{
	public static String execute()
	{
		double hoursWorked = 75;
		double payRate = 600;
		double grossPay = new ComputePayrollService().computeGrossPay(hoursWorked, payRate);
		
		System.out.println("hours Worked: " + hoursWorked);
		System.out.println("payrate: PHP" + payRate);
		System.out.println("Gross Payment: PHP" + grossPay);
		
		return "success";
	}
}
