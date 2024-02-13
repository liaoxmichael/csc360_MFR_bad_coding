package csc632TestPrep1;

public class Staff
{

	public Employee[] employees;
		
	
	public Staff()
	{
		employees = new Employee[0];
	}
	
	public void add_employee(String name, int type, float rate)
	{
		// new employee
		Employee e;
		
		if (type == 0)
		{
			e = new Contractor(name, rate);
		} 
		else if (type == 1)
		{
			e = new Hourly(name, rate);
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
		Employee[] newEmployees = new Employee[employees.length + 1];		
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
			payments[i] = employees[i].calc_pay();
		}
		
		return payments;
	}


	public static void main(String[] args)
	{
//		Staff s = new Staff();	
	}

}
