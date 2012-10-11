package petkov.TEST;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstJUnitTest {

	@Test
	public void testReadFile() {
		//MyFirstJUnit myfirst = new MyFirstJUnit();
		//assertEquals("Result", 3, );
		assertEquals("Result ", 3, MyFirstJUnit.readFile("C:\\Users\\BitMix\\workspace\\Testing\\petkov.txt"));
	}
	

}
