package csc632TestPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffTest
{
	
	Staff s;
	float[] payments;

	@BeforeEach
	void setUp() throws Exception
	{
		s = new Staff();
		
		s.add_employee("Bob", 0, 15);
		s.add_employee("Anne", 1, 20);
		s.add_employee("Susan", 2, 12);
		s.add_employee("Who?", 3, 1);
		
		Employee b = s.employees[0];
		Employee a = s.employees[1];
		Employee n = s.employees[2];
		
		b.setNum_hours(30);
		a.setNum_hours(30);
		n.setNum_hours(30);
		
		payments = s.pay_employees();
	}

	@Test
	void testAdd_employee()
	{	
		assertEquals(s.employees.length, 3);		
		assertEquals(payments[0], 450);
		assertEquals(payments[1], 600);
		assertEquals(payments[2], 480);

	}

}
