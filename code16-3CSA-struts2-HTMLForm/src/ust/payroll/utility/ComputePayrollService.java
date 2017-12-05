package ust.payroll.utility;

public class ComputePayrollService {
	
	public double computeGrossPay(double hoursWorked, double payRate)
	{
		return ((hoursWorked>40) ? ( (40*payRate) + (hoursWorked-40) * payRate*1.5) : (hoursWorked * payRate));
	}
}
