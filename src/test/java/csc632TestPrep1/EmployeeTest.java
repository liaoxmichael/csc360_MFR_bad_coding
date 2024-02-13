package csc632TestPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{
	Contractor c;
	Hourly h;
	Salary s;

	@BeforeEach
	void setUp() throws Exception
	{
		c = new Contractor("Bob", 20);
		h = new Hourly("Amanda", 20);
		s = new Salary("Helen", 20);
		
		c.setNum_hours(45);
		h.setNum_hours(45);
		s.setNum_hours(45);
	}

	@Test
	void test()
	{
		assertEquals(c.name, "Bob");
		assertEquals(h.name, "Amanda");
		assertEquals(s.name, "Helen");
		
		assertEquals(c.getHourly_rate(), 20);
		assertEquals(h.getHourly_rate(), 20);
		assertEquals(s.getHourly_rate(), 20);
		
		assertEquals(c.getNum_hours(), 45);
		assertEquals(h.getNum_hours(), 45);
		assertEquals(s.getNum_hours(), 45);
		
		assertEquals(c.calc_pay(), 900);
		assertEquals(h.calc_pay(), 950);
		assertEquals(s.calc_pay(), 800);
		
	}

}
