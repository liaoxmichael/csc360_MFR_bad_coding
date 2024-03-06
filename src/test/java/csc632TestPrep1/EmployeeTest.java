package csc632TestPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import csc360_MFR_bad_coding.fghjklhkgfjkjyfgdfjhbknfsjdhfbsdnclkdghfdnsjkruweygfdshabjk;
import csc360_MFR_bad_coding.cfghfjk;
import csc360_MFR_bad_coding.gdhjfkdshfgds;

class EmployeeTest
{
	fghjklhkgfjkjyfgdfjhbknfsjdhfbsdnclkdghfdnsjkruweygfdshabjk c;
	cfghfjk h;
	gdhjfkdshfgds s;

	@BeforeEach
	void setUp() throws Exception
	{
		c = new fghjklhkgfjkjyfgdfjhbknfsjdhfbsdnclkdghfdnsjkruweygfdshabjk("Bob", 20);
		h = new cfghfjk("Amanda", 20);
		s = new gdhjfkdshfgds("Helen", 20);
		
		c.fghjhklljhgh(45);
		h.fghjhklljhgh(45);
		s.fghjhklljhgh(45);
	}

	@Test
	void test()
	{
		assertEquals(c.int_name, "Bob");
		assertEquals(h.int_name, "Amanda");
		assertEquals(s.int_name, "Helen");
		
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
