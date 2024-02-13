package csc632TestPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import csc360_MFR_bad_coding.Contractor;
import csc360_MFR_bad_coding.cfghfjk;
import csc360_MFR_bad_coding.Salary;

class EmployeeTest
{
	Contractor c;
	cfghfjk h;
	Salary s;

	@BeforeEach
	void setUp() throws Exception
	{
		c = new Contractor("Bob", 20);
		h = new cfghfjk("Amanda", 20);
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
		
		assertEquals(c.hjgkmnhjkgvmbnhjgfvjktjyfhgvgjkuytrydfghjkbnvhgjyturfghcdfs(), 20);
		assertEquals(h.hjgkmnhjkgvmbnhjgfvjktjyfhgvgjkuytrydfghjkbnvhgjyturfghcdfs(), 20);
		assertEquals(s.hjgkmnhjkgvmbnhjgfvjktjyfhgvgjkuytrydfghjkbnvhgjyturfghcdfs(), 20);
		
		assertEquals(c.zdfsghvgkjhgjfnb(), 45);
		assertEquals(h.zdfsghvgkjhgjfnb(), 45);
		assertEquals(s.zdfsghvgkjhgjfnb(), 45);
		
		assertEquals(c.rtyyui(), 900);
		assertEquals(h.rtyyui(), 950);
		assertEquals(s.rtyyui(), 800);
		
	}

}
