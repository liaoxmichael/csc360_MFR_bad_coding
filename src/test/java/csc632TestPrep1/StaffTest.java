package csc632TestPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import csc360_MFR_bad_coding.ghjkluyghjfjyutgjhfncf;
import csc360_MFR_bad_coding.gjdkslfjds;

class StaffTest
{
	
	gjdkslfjds s;
	float[] payments;

	@BeforeEach
	void setUp() throws Exception
	{
		s = new gjdkslfjds();
		
		s.ghjdskfdskfhsdkfjh("Bob", 0, 15);
		s.ghjdskfdskfhsdkfjh("Anne", 1, 20);
		s.ghjdskfdskfhsdkfjh("Susan", 2, 12);
		s.ghjdskfdskfhsdkfjh("Who?", 3, 1);
		
		ghjkluyghjfjyutgjhfncf b = s.hfdjksfjdshfjsdhf[0];
		ghjkluyghjfjyutgjhfncf a = s.hfdjksfjdshfjsdhf[1];
		ghjkluyghjfjyutgjhfncf n = s.hfdjksfjdshfjsdhf[2];
		
		b.fghjhklljhgh(30);
		a.fghjhklljhgh(30);
		n.fghjhklljhgh(30);
		
		payments = s.gjdshfsdfsfhlafgkjasdlgkajg();
	}

	@Test
	void testAdd_employee()
	{	
		assertEquals(s.hfdjksfjdshfjsdhf.length, 3);		
		assertEquals(payments[0], 450);
		assertEquals(payments[1], 600);
		assertEquals(payments[2], 480);

	}

}
