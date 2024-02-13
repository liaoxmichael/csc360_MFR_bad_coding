package csc360_MFR_bad_coding;

public class Staff
{

	public ghjkluyghjfjyutgjhfncf[] employees;
		
	
	public Staff()
	{
		employees = new ghjkluyghjfjyutgjhfncf[0];
	}
	
	public void add_employee(String name, int type, float rate)
	{
		// new employee
		ghjkluyghjfjyutgjhfncf e;
		
		if (type == 0)
		{
			e = new fghjklhkgfjkjyfgdfjhbknfsjdhfbsdnclkdghfdnsjkruweygfdshabjk(name, rate);
		} 
		else if (type == 1)
		{
			e = new cfghfjk(name, rate);
		}
		else if (type == 2)
		{
			e = new Salary(name, rate);
		}
		else 
		{
			return;
		}
		
		// add new employee to employees array
		ghjkluyghjfjyutgjhfncf[] newEmployees = new ghjkluyghjfjyutgjhfncf[employees.length + 1];		
		for (int i = 0; i < employees.length; i ++) {
			newEmployees[i] = employees[i];
		}
		newEmployees[employees.length] = e;
		employees = newEmployees;
		
	}
	
	public float[] pay_employees()
	{
		float[] payments = new float[employees.length];
		
		for (int i = 0; i < employees.length; i ++)
		{
			payments[i] = employees[i].rtyyui();
		}
		
		return payments;
	}


	public static void main(String[] args)
	{
//		Staff s = new Staff();	
	}

}
