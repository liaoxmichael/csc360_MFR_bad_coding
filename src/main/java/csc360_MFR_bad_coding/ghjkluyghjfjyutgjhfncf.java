/**
 * 
 */
package csc632TestPrep1;


public abstract class Employee
{

	public String name;
	private float num_hours = 0;
	private float hourly_rate;
	
	/**
	 * @param name
	 * @param hourly_rate
	 */
	public Employee(String name, float hourly_rate)
	{
		this.name = name;
		this.hourly_rate = hourly_rate;
	}

	/**
	 * @return the num_hours
	 */
	public float getNum_hours()
	{
		return num_hours;
	}

	/**
	 * @param num_hours the num_hours to set
	 */
	public void setNum_hours(float num_hours)
	{
		this.num_hours = num_hours;
	}

	/**
	 * @return the hourly_rate
	 */
	public float getHourly_rate()
	{
		return hourly_rate;
	}
	
	public float calc_pay()
	{
		return 0;
	}
	
}
