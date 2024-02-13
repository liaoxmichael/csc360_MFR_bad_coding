package csc632TestPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import csc360_MFR_bad_coding.ghjkluyghjfjyutgjhfncf;
import csc360_MFR_bad_coding.Staff;

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
		
		ghjkluyghjfjyutgjhfncf b = s.employees[0];
		ghjkluyghjfjyutgjhfncf a = s.employees[1];
		ghjkluyghjfjyutgjhfncf n = s.employees[2];
		
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
