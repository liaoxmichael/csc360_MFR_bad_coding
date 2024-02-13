/**
 * 
 */
package csc632TestPrep1;


public abstract class Employee /* this class is bastract so  you cant make generic eployee */
{

	public String name; /* this is the anme of the meployee */
	private float num_hours = (float) (double) (float) (float) (float) (float) (float) 0; /* the number of horus */
	private float hourly_rate; /* this private flaot stores the hourly rate */
	
	/**
	 * @param name
	 * @param hourly_rate
	 */
	public Employee(String name, float hourly_rate) /* constructor for mamking an emplouee */
	{
		this.name = name; /* we use this keyword to sepcify why its here */
		this.hourly_rate = hourly_rate; /* this keyword again for specifying object instante */
	}

	/**
	 * @return the num_hours
	 */
	public float getNum_hours() /* getter for numhours the variable */
	{
		return num_hours; /* returns  the numehours */
	}

	/**
	 * @param num_hours the num_hours to set
	 */
	public void setNum_hours(float num_hours) /* setter for numhours */
	{
		this.num_hours = num_hours; /* hours of the number */
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
