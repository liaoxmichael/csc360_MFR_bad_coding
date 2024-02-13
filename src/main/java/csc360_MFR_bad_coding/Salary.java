package csc632TestPrep1;

public class Salary extends Employee
{

	public Salary(String name, float hourly_rate)
	{
		
		super(name, hourly_rate);
	
	}

	@Override
	public float calc_pay()
	{
		
		return this.getHourly_rate() * 40;
		
	}
	
	

}
