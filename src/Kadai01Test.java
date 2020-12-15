import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai01Test {

	@Test
	void testReverseString() {
		Kadai01 k = new Kadai01();
		assertNull(k.ReverseString(null));
		assertEquals("4321",k.ReverseString("1234"));
		assertEquals("",k.ReverseString(""));
		assertEquals("int",k.ReverseString("tni"));
		assertEquals("BbdD",k.ReverseString("DdbB"));
	}

}
