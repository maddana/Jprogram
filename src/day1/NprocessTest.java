package day1;//


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NprocessTest {
	Nprocess ob=new Nprocess();

	@Test
	public void testCheckEvenOdd() {
		ob.setData(10);
		String b=ob.checkEvenOdd();
		String a="even";
		assertEquals(a,b);
	}
	@Test
	public void testcheckEvenOdd1() {
		ob.setData(11);
		String b=ob.checkEvenOdd();
		String a="odd";
		assertEquals(a,b);
	}
	@Test
	public void testcheckEvenOdd2() {
		ob.setData(10000);
		String b=ob.checkEvenOdd();
		String a="greater_4";
		assertEquals(a,b);
	}
	@Test
	public void testcheckEvenOdd3() {
		ob.setData(-1);
		String b=ob.checkEvenOdd();
		String a="negative number";
		assertEquals(a,b);
	}

	@Test
	public void testCheckAmstrong1() {
		ob.setData(123);
		String a=ob.checkAmstrong();
		String b="Not_armstrong_number";
		assertEquals(b,a);
	}
	@Test
	public void testCheckAmstrong2() {
		ob.setData(153);
		String a=ob.checkAmstrong();
		String b="armstrong_number";
		assertEquals(b,a);
	}
	@Test
	public void testCheckAmstrong3() {
		ob.setData(-1);
		String a=ob.checkAmstrong();
		String b="Enter valid number";
		assertEquals(b,a);
	}
}
