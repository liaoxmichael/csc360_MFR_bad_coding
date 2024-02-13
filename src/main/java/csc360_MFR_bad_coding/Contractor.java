package csc632TestPrep1;

public class Contractor extends Employee
{

	public Contractor(String name, float hourly_rate)
	{
		super(name, hourly_rate);
	}

	@Override
	public float calc_pay()
	{
		return this.getHourly_rate() * this.getNum_hours();
	}
	
	

}
