package csc632TestPrep1;

public class Hourly extends Employee
{

	public Hourly(String name, float hourly_rate)
	{
		super(name, hourly_rate);
	}

	@Override
	public float calc_pay()
	{
		if (this.getNum_hours() < 40)
		{
			return this.getNum_hours() * this.getHourly_rate();
		} 
		else
		{
			return (float) (40 * this.getHourly_rate() + (this.getNum_hours() - 40) * this.getHourly_rate() * 1.5);
		}
	}
	
	

}
