package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void test() {
		
		int nombre1 = 1;
		int nombre2= 2;
		
		assertEquals(3, nombre1+nombre2);
	}

}
